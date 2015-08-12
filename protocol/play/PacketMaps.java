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
   private awv[] c;
   private int d;
   private int e;
   private int f;
   private int g;
   private byte[] h;


   public PacketMaps() {}

   public PacketMaps(int arg_0, byte arg_1, Collection arg_2, byte[] arg_3, int arg_4, int arg_5, int arg_6, int arg_7) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = (awv[])arg_2.toArray(new awv[arg_2.size()]);
      this.d = arg_4;
      this.e = arg_5;
      this.f = arg_6;
      this.g = arg_7;
      this.h = new byte[arg_6 * arg_7];

      for(int var9 = 0; var9 < arg_6; ++var9) {
         for(int var10 = 0; var10 < arg_7; ++var10) {
            this.h[var9 + var10 * arg_6] = arg_3[arg_4 + var9 + (arg_5 + var10) * 128];
         }
      }

   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = in.readByte();
      this.c = new awv[in.readVarInt()];

      for(int var2 = 0; var2 < this.c.length; ++var2) {
         short var3 = (short)in.readByte();
         this.c[var2] = new awv((byte)(var3 >> 4 & 15), in.readByte(), in.readByte(), (byte)(var3 & 15));
      }

      this.f = in.readUnsignedByte();
      if(this.f > 0) {
         this.g = in.readUnsignedByte();
         this.d = in.readUnsignedByte();
         this.e = in.readUnsignedByte();
         this.h = in.readByteArray();
      }

   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeByte(this.b);
      out.writeVarInt(this.c.length);
      awv[] var2 = this.c;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         awv var5 = var2[var4];
         out.writeByte((var5.a() & 15) << 4 | var5.d() & 15);
         out.writeByte(var5.b());
         out.writeByte(var5.c());
      }

      out.writeByte(this.f);
      if(this.f > 0) {
         out.writeByte(this.g);
         out.writeByte(this.d);
         out.writeByte(this.e);
         out.writeByteArray(this.h);
      }

   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public int a() {
      return this.a;
   }

   public void a(aww arg_0) {
      arg_0.e = this.b;
      arg_0.h.clear();

      int var2;
      for(var2 = 0; var2 < this.c.length; ++var2) {
         awv var3 = this.c[var2];
         arg_0.h.put("icon-" + var2, var3);
      }

      for(var2 = 0; var2 < this.f; ++var2) {
         for(int var4 = 0; var4 < this.g; ++var4) {
            arg_0.f[this.d + var2 + (this.e + var4) * 128] = this.h[var2 + var4 * this.f];
         }
      }

   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
