package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketSpawnObject implements Packet {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;


   public PacketSpawnObject() {}

   public PacketSpawnObject(wv arg_0, int arg_1) {
      this(arg_0, arg_1, 0);
   }

   public PacketSpawnObject(wv arg_0, int arg_1, int arg_2) {
      this.a = arg_0.F();
      this.b = uv.c(arg_0.s * 32.0D);
      this.c = uv.c(arg_0.t * 32.0D);
      this.d = uv.c(arg_0.u * 32.0D);
      this.h = uv.d(arg_0.z * 256.0F / 360.0F);
      this.i = uv.d(arg_0.y * 256.0F / 360.0F);
      this.j = arg_1;
      this.k = arg_2;
      if(arg_2 > 0) {
         double var4 = arg_0.v;
         double var6 = arg_0.w;
         double var8 = arg_0.x;
         double var10 = 3.9D;
         if(var4 < -var10) {
            var4 = -var10;
         }

         if(var6 < -var10) {
            var6 = -var10;
         }

         if(var8 < -var10) {
            var8 = -var10;
         }

         if(var4 > var10) {
            var4 = var10;
         }

         if(var6 > var10) {
            var6 = var10;
         }

         if(var8 > var10) {
            var8 = var10;
         }

         this.e = (int)(var4 * 8000.0D);
         this.f = (int)(var6 * 8000.0D);
         this.g = (int)(var8 * 8000.0D);
      }

   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.j = in.readByte();
      this.b = in.readInt();
      this.c = in.readInt();
      this.d = in.readInt();
      this.h = in.readByte();
      this.i = in.readByte();
      this.k = in.readInt();
      if(this.k > 0) {
         this.e = in.readShort();
         this.f = in.readShort();
         this.g = in.readShort();
      }

   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeByte(this.j);
      out.writeInt(this.b);
      out.writeInt(this.c);
      out.writeInt(this.d);
      out.writeByte(this.h);
      out.writeByte(this.i);
      out.writeInt(this.k);
      if(this.k > 0) {
         out.writeShort(this.e);
         out.writeShort(this.f);
         out.writeShort(this.g);
      }

   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }

   public int f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public int h() {
      return this.h;
   }

   public int i() {
      return this.i;
   }

   public int j() {
      return this.j;
   }

   public int k() {
      return this.k;
   }

   public void a(int arg_0) {
      this.b = arg_0;
   }

   public void b(int arg_0) {
      this.c = arg_0;
   }

   public void c(int arg_0) {
      this.d = arg_0;
   }

   public void d(int arg_0) {
      this.e = arg_0;
   }

   public void e(int arg_0) {
      this.f = arg_0;
   }

   public void f(int arg_0) {
      this.g = arg_0;
   }

   public void g(int arg_0) {
      this.k = arg_0;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
