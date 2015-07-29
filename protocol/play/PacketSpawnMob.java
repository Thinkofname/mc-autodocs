package net.minecraft.network.play;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketSpawnMob implements Packet {

   private int a;
   private UUID b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private byte j;
   private byte k;
   private byte l;
   private qi m;
   private List n;


   public PacketSpawnMob() {}

   public PacketSpawnMob(qa arg_0) {
      this.a = arg_0.F();
      this.b = arg_0.aM();
      this.c = (byte)pt.a((pr)arg_0);
      this.d = nu.c(arg_0.s * 32.0D);
      this.e = nu.c(arg_0.t * 32.0D);
      this.f = nu.c(arg_0.u * 32.0D);
      this.j = (byte)((int)(arg_0.y * 256.0F / 360.0F));
      this.k = (byte)((int)(arg_0.z * 256.0F / 360.0F));
      this.l = (byte)((int)(arg_0.aN * 256.0F / 360.0F));
      double var2 = 3.9D;
      double var4 = arg_0.v;
      double var6 = arg_0.w;
      double var8 = arg_0.x;
      if(var4 < -var2) {
         var4 = -var2;
      }

      if(var6 < -var2) {
         var6 = -var2;
      }

      if(var8 < -var2) {
         var8 = -var2;
      }

      if(var4 > var2) {
         var4 = var2;
      }

      if(var6 > var2) {
         var6 = var2;
      }

      if(var8 > var2) {
         var8 = var2;
      }

      this.g = (int)(var4 * 8000.0D);
      this.h = (int)(var6 * 8000.0D);
      this.i = (int)(var8 * 8000.0D);
      this.m = arg_0.H();
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = in.readUUID();
      this.c = in.readByte() & 255;
      this.d = in.readInt();
      this.e = in.readInt();
      this.f = in.readInt();
      this.j = in.readByte();
      this.k = in.readByte();
      this.l = in.readByte();
      this.g = in.readShort();
      this.h = in.readShort();
      this.i = in.readShort();
      this.n = qi.b(in);
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeUUID(this.b);
      out.writeByte(this.c & 255);
      out.writeInt(this.d);
      out.writeInt(this.e);
      out.writeInt(this.f);
      out.writeByte(this.j);
      out.writeByte(this.k);
      out.writeByte(this.l);
      out.writeShort(this.g);
      out.writeShort(this.h);
      out.writeShort(this.i);
      this.m.a(out);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public List a() {
      if(this.n == null) {
         this.n = this.m.c();
      }

      return this.n;
   }

   public int b() {
      return this.a;
   }

   public UUID c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public int e() {
      return this.d;
   }

   public int f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public int h() {
      return this.g;
   }

   public int i() {
      return this.h;
   }

   public int j() {
      return this.i;
   }

   public byte k() {
      return this.j;
   }

   public byte l() {
      return this.k;
   }

   public byte m() {
      return this.l;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
