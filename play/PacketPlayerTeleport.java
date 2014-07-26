package net.minecraft.network.play;

import java.util.Set;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

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
      this.f = ih.a(in.readUnsignedByte());
   }

   public void write(PacketByteBuf out) {
      out.writeDouble(this.a);
      out.writeDouble(this.b);
      out.writeDouble(this.c);
      out.writeFloat(this.d);
      out.writeFloat(this.e);
      out.writeByte(ih.a(this.f));
   }

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}
