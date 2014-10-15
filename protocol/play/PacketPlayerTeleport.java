package net.minecraft.network.play;

import java.util.Set;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketPlayerTeleport implements Packet {

   private double a;
   private double b;
   private double c;
   private float d;
   private float e;
   private Set f;


   public PacketPlayerTeleport() {}

   public PacketPlayerTeleport(double arg_0, double arg_2, double arg_4, float var7, float var8, Set var9) {
      this.a = arg_0;
      this.b = arg_2;
      this.c = arg_4;
      this.d = var7;
      this.e = var8;
      this.f = var9;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readDouble();
      this.b = in.readDouble();
      this.c = in.readDouble();
      this.d = in.readFloat();
      this.e = in.readFloat();
      this.f = ik.a(in.readUnsignedByte());
   }

   public void write(PacketByteBuf out) {
      out.writeDouble(this.a);
      out.writeDouble(this.b);
      out.writeDouble(this.c);
      out.writeFloat(this.d);
      out.writeFloat(this.e);
      out.writeByte(ik.a(this.f));
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
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

   public Set f() {
      return this.f;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
