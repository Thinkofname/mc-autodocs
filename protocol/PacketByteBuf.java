package net.minecraft.network;

import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.ByteBufProcessor;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ReferenceCounted;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.UUID;
import net.minecraft.chat.IChatMessage;
import net.minecraft.inventory.ItemStack;
import net.minecraft.math.Position;

public class PacketByteBuf extends ByteBuf {

   private final ByteBuf a;


   public PacketByteBuf(ByteBuf arg_0) {
      this.a = arg_0;
   }

   public static int a(int arg_0) {
      for(int var1 = 1; var1 < 5; ++var1) {
         if((arg_0 & -1 << var1 * 7) == 0) {
            return var1;
         }
      }

      return 5;
   }

   public void writeByteArray(byte[] arg_0) {
      this.writeVarInt(arg_0.length);
      this.writeBytes(arg_0);
   }

   public byte[] readByteArray() {
      byte[] var1 = new byte[this.readVarInt()];
      this.readBytes(var1);
      return var1;
   }

   public Position readPosition() {
      return Position.a(this.readLong());
   }

   public void writePosition(Position arg_0) {
      this.writeLong(arg_0.g());
   }

   public IChatMessage readChat() {
      return ho.a(this.readString(32767));
   }

   public void writeChat(IChatMessage arg_0) {
      this.writeString(ho.a(arg_0));
   }

   public Enum readEnum(Class arg_0) {
      return ((Enum[])arg_0.getEnumConstants())[this.readVarInt()];
   }

   public void writeEnum(Enum arg_0) {
      this.writeVarInt(arg_0.ordinal());
   }

   public int readVarInt() {
      int var1 = 0;
      int var2 = 0;

      byte var3;
      do {
         var3 = this.readByte();
         var1 |= (var3 & 127) << var2++ * 7;
         if(var2 > 5) {
            throw new RuntimeException("VarInt too big");
         }
      } while((var3 & 128) == 128);

      return var1;
   }

   public long readVarLong() {
      long var1 = 0L;
      int var3 = 0;

      byte var4;
      do {
         var4 = this.readByte();
         var1 |= (long)(var4 & 127) << var3++ * 7;
         if(var3 > 10) {
            throw new RuntimeException("VarLong too big");
         }
      } while((var4 & 128) == 128);

      return var1;
   }

   public void writeUUID(UUID arg_0) {
      this.writeLong(arg_0.getMostSignificantBits());
      this.writeLong(arg_0.getLeastSignificantBits());
   }

   public UUID readUUID() {
      return new UUID(this.readLong(), this.readLong());
   }

   public void writeVarInt(int arg_0) {
      while((arg_0 & -128) != 0) {
         this.writeByte(arg_0 & 127 | 128);
         arg_0 >>>= 7;
      }

      this.writeByte(arg_0);
   }

   public void writeVarLong(long arg_0) {
      while((arg_0 & -128L) != 0L) {
         this.writeByte((int)(arg_0 & 127L) | 128);
         arg_0 >>>= 7;
      }

      this.writeByte((int)arg_0);
   }

   public void a(fm arg_0) {
      if(arg_0 == null) {
         this.writeByte(0);
      } else {
         try {
            fy.a(arg_0, (DataOutput)(new ByteBufOutputStream(this)));
         } catch (IOException var3) {
            throw new EncoderException(var3);
         }
      }

   }

   public fm h() {
      int var1 = this.readerIndex();
      byte var2 = this.readByte();
      if(var2 == 0) {
         return null;
      } else {
         this.readerIndex(var1);
         return fy.a((DataInput)(new ByteBufInputStream(this)), new fw(2097152L));
      }
   }

   public void writeItemStack(ItemStack arg_0) {
      if(arg_0 == null) {
         this.writeShort(-1);
      } else {
         this.writeShort(alj.b(arg_0.b()));
         this.writeByte(arg_0.b);
         this.writeShort(arg_0.i());
         fm var2 = null;
         if(arg_0.b().m() || arg_0.b().p()) {
            var2 = arg_0.o();
         }

         this.a(var2);
      }

   }

   public ItemStack readItemStack() {
      ItemStack var1 = null;
      short var2 = this.readShort();
      if(var2 >= 0) {
         byte var3 = this.readByte();
         short var4 = this.readShort();
         var1 = new ItemStack(alj.b(var2), var3, var4);
         var1.d(this.h());
      }

      return var1;
   }

   public String readString(int arg_0) {
      int var2 = this.readVarInt();
      if(var2 > arg_0 * 4) {
         throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + var2 + " > " + arg_0 * 4 + ")");
      } else if(var2 < 0) {
         throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
      } else {
         String var3 = new String(this.readBytes(var2).array(), Charsets.UTF_8);
         if(var3.length() > arg_0) {
            throw new DecoderException("The received string length is longer than maximum allowed (" + var2 + " > " + arg_0 + ")");
         } else {
            return var3;
         }
      }
   }

   public PacketByteBuf writeString(String arg_0) {
      byte[] var2 = arg_0.getBytes(Charsets.UTF_8);
      if(var2.length > 32767) {
         throw new EncoderException("String too big (was " + arg_0.length() + " bytes encoded, max " + 32767 + ")");
      } else {
         this.writeVarInt(var2.length);
         this.writeBytes(var2);
         return this;
      }
   }

   public int capacity() {
      return this.a.capacity();
   }

   public ByteBuf capacity(int arg_0) {
      return this.a.capacity(arg_0);
   }

   public int maxCapacity() {
      return this.a.maxCapacity();
   }

   public ByteBufAllocator alloc() {
      return this.a.alloc();
   }

   public ByteOrder order() {
      return this.a.order();
   }

   public ByteBuf order(ByteOrder arg_0) {
      return this.a.order(arg_0);
   }

   public ByteBuf unwrap() {
      return this.a.unwrap();
   }

   public boolean isDirect() {
      return this.a.isDirect();
   }

   public int readerIndex() {
      return this.a.readerIndex();
   }

   public ByteBuf readerIndex(int arg_0) {
      return this.a.readerIndex(arg_0);
   }

   public int writerIndex() {
      return this.a.writerIndex();
   }

   public ByteBuf writerIndex(int arg_0) {
      return this.a.writerIndex(arg_0);
   }

   public ByteBuf setIndex(int arg_0, int arg_1) {
      return this.a.setIndex(arg_0, arg_1);
   }

   public int readableBytes() {
      return this.a.readableBytes();
   }

   public int writableBytes() {
      return this.a.writableBytes();
   }

   public int maxWritableBytes() {
      return this.a.maxWritableBytes();
   }

   public boolean isReadable() {
      return this.a.isReadable();
   }

   public boolean isReadable(int arg_0) {
      return this.a.isReadable(arg_0);
   }

   public boolean isWritable() {
      return this.a.isWritable();
   }

   public boolean isWritable(int arg_0) {
      return this.a.isWritable(arg_0);
   }

   public ByteBuf clear() {
      return this.a.clear();
   }

   public ByteBuf markReaderIndex() {
      return this.a.markReaderIndex();
   }

   public ByteBuf resetReaderIndex() {
      return this.a.resetReaderIndex();
   }

   public ByteBuf markWriterIndex() {
      return this.a.markWriterIndex();
   }

   public ByteBuf resetWriterIndex() {
      return this.a.resetWriterIndex();
   }

   public ByteBuf discardReadBytes() {
      return this.a.discardReadBytes();
   }

   public ByteBuf discardSomeReadBytes() {
      return this.a.discardSomeReadBytes();
   }

   public ByteBuf ensureWritable(int arg_0) {
      return this.a.ensureWritable(arg_0);
   }

   public int ensureWritable(int arg_0, boolean arg_1) {
      return this.a.ensureWritable(arg_0, arg_1);
   }

   public boolean getBoolean(int arg_0) {
      return this.a.getBoolean(arg_0);
   }

   public byte getByte(int arg_0) {
      return this.a.getByte(arg_0);
   }

   public short getUnsignedByte(int arg_0) {
      return this.a.getUnsignedByte(arg_0);
   }

   public short getShort(int arg_0) {
      return this.a.getShort(arg_0);
   }

   public int getUnsignedShort(int arg_0) {
      return this.a.getUnsignedShort(arg_0);
   }

   public int getMedium(int arg_0) {
      return this.a.getMedium(arg_0);
   }

   public int getUnsignedMedium(int arg_0) {
      return this.a.getUnsignedMedium(arg_0);
   }

   public int getInt(int arg_0) {
      return this.a.getInt(arg_0);
   }

   public long getUnsignedInt(int arg_0) {
      return this.a.getUnsignedInt(arg_0);
   }

   public long getLong(int arg_0) {
      return this.a.getLong(arg_0);
   }

   public char getChar(int arg_0) {
      return this.a.getChar(arg_0);
   }

   public float getFloat(int arg_0) {
      return this.a.getFloat(arg_0);
   }

   public double getDouble(int arg_0) {
      return this.a.getDouble(arg_0);
   }

   public ByteBuf getBytes(int arg_0, ByteBuf arg_1) {
      return this.a.getBytes(arg_0, arg_1);
   }

   public ByteBuf getBytes(int arg_0, ByteBuf arg_1, int arg_2) {
      return this.a.getBytes(arg_0, arg_1, arg_2);
   }

   public ByteBuf getBytes(int arg_0, ByteBuf arg_1, int arg_2, int arg_3) {
      return this.a.getBytes(arg_0, arg_1, arg_2, arg_3);
   }

   public ByteBuf getBytes(int arg_0, byte[] arg_1) {
      return this.a.getBytes(arg_0, arg_1);
   }

   public ByteBuf getBytes(int arg_0, byte[] arg_1, int arg_2, int arg_3) {
      return this.a.getBytes(arg_0, arg_1, arg_2, arg_3);
   }

   public ByteBuf getBytes(int arg_0, ByteBuffer arg_1) {
      return this.a.getBytes(arg_0, arg_1);
   }

   public ByteBuf getBytes(int arg_0, OutputStream arg_1, int arg_2) {
      return this.a.getBytes(arg_0, arg_1, arg_2);
   }

   public int getBytes(int arg_0, GatheringByteChannel arg_1, int arg_2) {
      return this.a.getBytes(arg_0, arg_1, arg_2);
   }

   public ByteBuf setBoolean(int arg_0, boolean arg_1) {
      return this.a.setBoolean(arg_0, arg_1);
   }

   public ByteBuf setByte(int arg_0, int arg_1) {
      return this.a.setByte(arg_0, arg_1);
   }

   public ByteBuf setShort(int arg_0, int arg_1) {
      return this.a.setShort(arg_0, arg_1);
   }

   public ByteBuf setMedium(int arg_0, int arg_1) {
      return this.a.setMedium(arg_0, arg_1);
   }

   public ByteBuf setInt(int arg_0, int arg_1) {
      return this.a.setInt(arg_0, arg_1);
   }

   public ByteBuf setLong(int arg_0, long arg_1) {
      return this.a.setLong(arg_0, arg_1);
   }

   public ByteBuf setChar(int arg_0, int arg_1) {
      return this.a.setChar(arg_0, arg_1);
   }

   public ByteBuf setFloat(int arg_0, float arg_1) {
      return this.a.setFloat(arg_0, arg_1);
   }

   public ByteBuf setDouble(int arg_0, double arg_1) {
      return this.a.setDouble(arg_0, arg_1);
   }

   public ByteBuf setBytes(int arg_0, ByteBuf arg_1) {
      return this.a.setBytes(arg_0, arg_1);
   }

   public ByteBuf setBytes(int arg_0, ByteBuf arg_1, int arg_2) {
      return this.a.setBytes(arg_0, arg_1, arg_2);
   }

   public ByteBuf setBytes(int arg_0, ByteBuf arg_1, int arg_2, int arg_3) {
      return this.a.setBytes(arg_0, arg_1, arg_2, arg_3);
   }

   public ByteBuf setBytes(int arg_0, byte[] arg_1) {
      return this.a.setBytes(arg_0, arg_1);
   }

   public ByteBuf setBytes(int arg_0, byte[] arg_1, int arg_2, int arg_3) {
      return this.a.setBytes(arg_0, arg_1, arg_2, arg_3);
   }

   public ByteBuf setBytes(int arg_0, ByteBuffer arg_1) {
      return this.a.setBytes(arg_0, arg_1);
   }

   public int setBytes(int arg_0, InputStream arg_1, int arg_2) {
      return this.a.setBytes(arg_0, arg_1, arg_2);
   }

   public int setBytes(int arg_0, ScatteringByteChannel arg_1, int arg_2) {
      return this.a.setBytes(arg_0, arg_1, arg_2);
   }

   public ByteBuf setZero(int arg_0, int arg_1) {
      return this.a.setZero(arg_0, arg_1);
   }

   public boolean readBoolean() {
      return this.a.readBoolean();
   }

   public byte readByte() {
      return this.a.readByte();
   }

   public short readUnsignedByte() {
      return this.a.readUnsignedByte();
   }

   public short readShort() {
      return this.a.readShort();
   }

   public int readUnsignedShort() {
      return this.a.readUnsignedShort();
   }

   public int readMedium() {
      return this.a.readMedium();
   }

   public int readUnsignedMedium() {
      return this.a.readUnsignedMedium();
   }

   public int readInt() {
      return this.a.readInt();
   }

   public long readUnsignedInt() {
      return this.a.readUnsignedInt();
   }

   public long readLong() {
      return this.a.readLong();
   }

   public char readChar() {
      return this.a.readChar();
   }

   public float readFloat() {
      return this.a.readFloat();
   }

   public double readDouble() {
      return this.a.readDouble();
   }

   public ByteBuf readBytes(int arg_0) {
      return this.a.readBytes(arg_0);
   }

   public ByteBuf readSlice(int arg_0) {
      return this.a.readSlice(arg_0);
   }

   public ByteBuf readBytes(ByteBuf arg_0) {
      return this.a.readBytes(arg_0);
   }

   public ByteBuf readBytes(ByteBuf arg_0, int arg_1) {
      return this.a.readBytes(arg_0, arg_1);
   }

   public ByteBuf readBytes(ByteBuf arg_0, int arg_1, int arg_2) {
      return this.a.readBytes(arg_0, arg_1, arg_2);
   }

   public ByteBuf readBytes(byte[] arg_0) {
      return this.a.readBytes(arg_0);
   }

   public ByteBuf readBytes(byte[] arg_0, int arg_1, int arg_2) {
      return this.a.readBytes(arg_0, arg_1, arg_2);
   }

   public ByteBuf readBytes(ByteBuffer arg_0) {
      return this.a.readBytes(arg_0);
   }

   public ByteBuf readBytes(OutputStream arg_0, int arg_1) {
      return this.a.readBytes(arg_0, arg_1);
   }

   public int readBytes(GatheringByteChannel arg_0, int arg_1) {
      return this.a.readBytes(arg_0, arg_1);
   }

   public ByteBuf skipBytes(int arg_0) {
      return this.a.skipBytes(arg_0);
   }

   public ByteBuf writeBoolean(boolean arg_0) {
      return this.a.writeBoolean(arg_0);
   }

   public ByteBuf writeByte(int arg_0) {
      return this.a.writeByte(arg_0);
   }

   public ByteBuf writeShort(int arg_0) {
      return this.a.writeShort(arg_0);
   }

   public ByteBuf writeMedium(int arg_0) {
      return this.a.writeMedium(arg_0);
   }

   public ByteBuf writeInt(int arg_0) {
      return this.a.writeInt(arg_0);
   }

   public ByteBuf writeLong(long arg_0) {
      return this.a.writeLong(arg_0);
   }

   public ByteBuf writeChar(int arg_0) {
      return this.a.writeChar(arg_0);
   }

   public ByteBuf writeFloat(float arg_0) {
      return this.a.writeFloat(arg_0);
   }

   public ByteBuf writeDouble(double arg_0) {
      return this.a.writeDouble(arg_0);
   }

   public ByteBuf writeBytes(ByteBuf arg_0) {
      return this.a.writeBytes(arg_0);
   }

   public ByteBuf writeBytes(ByteBuf arg_0, int arg_1) {
      return this.a.writeBytes(arg_0, arg_1);
   }

   public ByteBuf writeBytes(ByteBuf arg_0, int arg_1, int arg_2) {
      return this.a.writeBytes(arg_0, arg_1, arg_2);
   }

   public ByteBuf writeBytes(byte[] arg_0) {
      return this.a.writeBytes(arg_0);
   }

   public ByteBuf writeBytes(byte[] arg_0, int arg_1, int arg_2) {
      return this.a.writeBytes(arg_0, arg_1, arg_2);
   }

   public ByteBuf writeBytes(ByteBuffer arg_0) {
      return this.a.writeBytes(arg_0);
   }

   public int writeBytes(InputStream arg_0, int arg_1) {
      return this.a.writeBytes(arg_0, arg_1);
   }

   public int writeBytes(ScatteringByteChannel arg_0, int arg_1) {
      return this.a.writeBytes(arg_0, arg_1);
   }

   public ByteBuf writeZero(int arg_0) {
      return this.a.writeZero(arg_0);
   }

   public int indexOf(int arg_0, int arg_1, byte arg_2) {
      return this.a.indexOf(arg_0, arg_1, arg_2);
   }

   public int bytesBefore(byte arg_0) {
      return this.a.bytesBefore(arg_0);
   }

   public int bytesBefore(int arg_0, byte arg_1) {
      return this.a.bytesBefore(arg_0, arg_1);
   }

   public int bytesBefore(int arg_0, int arg_1, byte arg_2) {
      return this.a.bytesBefore(arg_0, arg_1, arg_2);
   }

   public int forEachByte(ByteBufProcessor arg_0) {
      return this.a.forEachByte(arg_0);
   }

   public int forEachByte(int arg_0, int arg_1, ByteBufProcessor arg_2) {
      return this.a.forEachByte(arg_0, arg_1, arg_2);
   }

   public int forEachByteDesc(ByteBufProcessor arg_0) {
      return this.a.forEachByteDesc(arg_0);
   }

   public int forEachByteDesc(int arg_0, int arg_1, ByteBufProcessor arg_2) {
      return this.a.forEachByteDesc(arg_0, arg_1, arg_2);
   }

   public ByteBuf copy() {
      return this.a.copy();
   }

   public ByteBuf copy(int arg_0, int arg_1) {
      return this.a.copy(arg_0, arg_1);
   }

   public ByteBuf slice() {
      return this.a.slice();
   }

   public ByteBuf slice(int arg_0, int arg_1) {
      return this.a.slice(arg_0, arg_1);
   }

   public ByteBuf duplicate() {
      return this.a.duplicate();
   }

   public int nioBufferCount() {
      return this.a.nioBufferCount();
   }

   public ByteBuffer nioBuffer() {
      return this.a.nioBuffer();
   }

   public ByteBuffer nioBuffer(int arg_0, int arg_1) {
      return this.a.nioBuffer(arg_0, arg_1);
   }

   public ByteBuffer internalNioBuffer(int arg_0, int arg_1) {
      return this.a.internalNioBuffer(arg_0, arg_1);
   }

   public ByteBuffer[] nioBuffers() {
      return this.a.nioBuffers();
   }

   public ByteBuffer[] nioBuffers(int arg_0, int arg_1) {
      return this.a.nioBuffers(arg_0, arg_1);
   }

   public boolean hasArray() {
      return this.a.hasArray();
   }

   public byte[] array() {
      return this.a.array();
   }

   public int arrayOffset() {
      return this.a.arrayOffset();
   }

   public boolean hasMemoryAddress() {
      return this.a.hasMemoryAddress();
   }

   public long memoryAddress() {
      return this.a.memoryAddress();
   }

   public String toString(Charset arg_0) {
      return this.a.toString(arg_0);
   }

   public String toString(int arg_0, int arg_1, Charset arg_2) {
      return this.a.toString(arg_0, arg_1, arg_2);
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   public boolean equals(Object arg_0) {
      return this.a.equals(arg_0);
   }

   public int compareTo(ByteBuf arg_0) {
      return this.a.compareTo(arg_0);
   }

   public String toString() {
      return this.a.toString();
   }

   public ByteBuf retain(int arg_0) {
      return this.a.retain(arg_0);
   }

   public ByteBuf retain() {
      return this.a.retain();
   }

   public int refCnt() {
      return this.a.refCnt();
   }

   public boolean release() {
      return this.a.release();
   }

   public boolean release(int arg_0) {
      return this.a.release(arg_0);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public ReferenceCounted retain(int arg_0) {
      return this.retain(arg_0);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public ReferenceCounted retain() {
      return this.retain();
   }

   // $FF: synthetic method
   // $FF: bridge method
   public int compareTo(Object arg_0) {
      return this.compareTo((ByteBuf)arg_0);
   }
}
