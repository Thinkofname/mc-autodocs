package net.minecraft.network.play;

import java.util.List;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketSpawnMob implements Packet {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private byte i;
   private byte j;
   private byte k;
   private xr l;
   private List m;


   public PacketSpawnMob() {}

   public PacketSpawnMob(xh arg_0) {
      this.a = arg_0.E();
      this.b = (byte)wq.a(arg_0);
      this.c = uk.c(arg_0.s * 32.0D);
      this.d = uk.c(arg_0.t * 32.0D);
      this.e = uk.c(arg_0.u * 32.0D);
      this.i = (byte)((int)(arg_0.y * 256.0F / 360.0F));
      this.j = (byte)((int)(arg_0.z * 256.0F / 360.0F));
      this.k = (byte)((int)(arg_0.aI * 256.0F / 360.0F));
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

      this.f = (int)(var4 * 8000.0D);
      this.g = (int)(var6 * 8000.0D);
      this.h = (int)(var8 * 8000.0D);
      this.l = arg_0.G();
   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = in.readByte() & 255;
      this.c = in.readInt();
      this.d = in.readInt();
      this.e = in.readInt();
      this.i = in.readByte();
      this.j = in.readByte();
      this.k = in.readByte();
      this.f = in.readShort();
      this.g = in.readShort();
      this.h = in.readShort();
      this.m = xr.b(in);
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeByte(this.b & 255);
      out.writeInt(this.c);
      out.writeInt(this.d);
      out.writeInt(this.e);
      out.writeByte(this.i);
      out.writeByte(this.j);
      out.writeByte(this.k);
      out.writeShort(this.f);
      out.writeShort(this.g);
      out.writeShort(this.h);
      this.l.a(out);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
