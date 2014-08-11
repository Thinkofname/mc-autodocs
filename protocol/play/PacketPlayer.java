package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketPlayer implements Packet {

   public double a;
   public double b;
   public double c;
   public float d;
   public float e;
   public boolean f;
   public boolean g;
   public boolean h;


   public PacketPlayer() {}

   public PacketPlayer(boolean arg_0) {
      this.f = arg_0;
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) {
      this.f = in.readUnsignedByte() != 0;
   }

   public void write(PacketByteBuf out) {
      out.writeByte(this.f?1:0);
   }

   public double a() {
      return this.a;
   }

   public double b() {
      return this.b;
   }

   public double c() {
      return this.c;
   }

   public float d() {
      return this.d;
   }

   public float e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }

   public boolean g() {
      return this.g;
   }

   public boolean h() {
      return this.h;
   }

   public void a(boolean arg_0) {
      this.g = arg_0;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
