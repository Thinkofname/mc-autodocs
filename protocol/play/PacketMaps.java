package net.minecraft.network.play;

import java.io.IOException;
import java.util.Collection;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketMaps implements Packet {

   private int a;
   private byte b;
   private boolean c;
   private axe[] d;
   private int e;
   private int f;
   private int g;
   private int h;
   private byte[] i;


   public PacketMaps() {}

   public PacketMaps(int arg_0, byte arg_1, boolean arg_2, Collection arg_3, byte[] arg_4, int arg_5, int arg_6, int arg_7, int arg_8) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
      this.d = (axe[])arg_3.toArray(new axe[arg_3.size()]);
      this.e = arg_5;
      this.f = arg_6;
      this.g = arg_7;
      this.h = arg_8;
      this.i = new byte[arg_7 * arg_8];

      for(int var10 = 0; var10 < arg_7; ++var10) {
         for(int var11 = 0; var11 < arg_8; ++var11) {
            this.i[var10 + var11 * arg_7] = arg_4[arg_5 + var10 + (arg_6 + var11) * 128];
         }
      }

   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = in.readByte();
      this.c = in.readBoolean();
      this.d = new axe[in.readVarInt()];

      for(int var2 = 0; var2 < this.d.length; ++var2) {
         short var3 = (short)in.readByte();
         this.d[var2] = new axe((byte)(var3 >> 4 & 15), in.readByte(), in.readByte(), (byte)(var3 & 15));
      }

      this.g = in.readUnsignedByte();
      if(this.g > 0) {
         this.h = in.readUnsignedByte();
         this.e = in.readUnsignedByte();
         this.f = in.readUnsignedByte();
         this.i = in.readByteArray();
      }

   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeByte(this.b);
      out.writeBoolean(this.c);
      out.writeVarInt(this.d.length);
      axe[] var2 = this.d;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         axe var5 = var2[var4];
         out.writeByte((var5.a() & 15) << 4 | var5.d() & 15);
         out.writeByte(var5.b());
         out.writeByte(var5.c());
      }

      out.writeByte(this.g);
      if(this.g > 0) {
         out.writeByte(this.h);
         out.writeByte(this.e);
         out.writeByte(this.f);
         out.writeByteArray(this.i);
      }

   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public int a() {
      return this.a;
   }

   public void a(axf arg_0) {
      arg_0.f = this.b;
      arg_0.e = this.c;
      arg_0.i.clear();

      int var2;
      for(var2 = 0; var2 < this.d.length; ++var2) {
         axe var3 = this.d[var2];
         arg_0.i.put("icon-" + var2, var3);
      }

      for(var2 = 0; var2 < this.g; ++var2) {
         for(int var4 = 0; var4 < this.h; ++var4) {
            arg_0.g[this.e + var2 + (this.f + var4) * 128] = this.i[var2 + var4 * this.g];
         }
      }

   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
