package net.minecraft.network.play;

import java.io.IOException;
import java.util.UUID;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketSpawnObject implements Packet {

   private int a;
   private UUID b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;


   public PacketSpawnObject() {}

   public PacketSpawnObject(qa arg_0, int arg_1) {
      this(arg_0, arg_1, 0);
   }

   public PacketSpawnObject(qa arg_0, int arg_1, int arg_2) {
      this.a = arg_0.F();
      this.b = arg_0.aN();
      this.c = nu.c(arg_0.s * 32.0D);
      this.d = nu.c(arg_0.t * 32.0D);
      this.e = nu.c(arg_0.u * 32.0D);
      this.i = nu.d(arg_0.z * 256.0F / 360.0F);
      this.j = nu.d(arg_0.y * 256.0F / 360.0F);
      this.k = arg_1;
      this.l = arg_2;
      double var4 = 3.9D;
      this.f = (int)(nu.a(arg_0.v, -3.9D, 3.9D) * 8000.0D);
      this.g = (int)(nu.a(arg_0.w, -3.9D, 3.9D) * 8000.0D);
      this.h = (int)(nu.a(arg_0.x, -3.9D, 3.9D) * 8000.0D);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = in.readUUID();
      this.k = in.readByte();
      this.c = in.readInt();
      this.d = in.readInt();
      this.e = in.readInt();
      this.i = in.readByte();
      this.j = in.readByte();
      this.l = in.readInt();
      this.f = in.readShort();
      this.g = in.readShort();
      this.h = in.readShort();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeUUID(this.b);
      out.writeByte(this.k);
      out.writeInt(this.c);
      out.writeInt(this.d);
      out.writeInt(this.e);
      out.writeByte(this.i);
      out.writeByte(this.j);
      out.writeInt(this.l);
      out.writeShort(this.f);
      out.writeShort(this.g);
      out.writeShort(this.h);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public int a() {
      return this.a;
   }

   public UUID b() {
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

   public int l() {
      return this.l;
   }

   public void a(int arg_0) {
      this.c = arg_0;
   }

   public void b(int arg_0) {
      this.d = arg_0;
   }

   public void c(int arg_0) {
      this.e = arg_0;
   }

   public void d(int arg_0) {
      this.f = arg_0;
   }

   public void e(int arg_0) {
      this.g = arg_0;
   }

   public void f(int arg_0) {
      this.h = arg_0;
   }

   public void g(int arg_0) {
      this.l = arg_0;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
