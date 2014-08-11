package net.minecraft.network.play;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;
import net.minecraft.network.play.PacketPlayer;

public class PacketPlayerPositionAndLook extends PacketPlayer {

   public PacketPlayerPositionAndLook() {
      this.g = true;
      this.h = true;
   }

   public PacketPlayerPositionAndLook(double arg_0, double arg_2, double arg_4, float var7, float var8, boolean var9) {
      this.a = arg_0;
      this.b = arg_2;
      this.c = arg_4;
      this.d = var7;
      this.e = var8;
      this.f = var9;
      this.h = true;
      this.g = true;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readDouble();
      this.b = in.readDouble();
      this.c = in.readDouble();
      this.d = in.readFloat();
      this.e = in.readFloat();
      super.read(in);
   }

   public void write(PacketByteBuf out) {
      out.writeDouble(this.a);
      out.writeDouble(this.b);
      out.writeDouble(this.c);
      out.writeFloat(this.d);
      out.writeFloat(this.e);
      super.write(out);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      super.handle((PacketHandlerPlayServerbound)handler);
   }
}
