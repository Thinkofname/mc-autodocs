package net.minecraft.network.play;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;
import net.minecraft.network.play.PacketPlayer;

public class PacketPlayerPosition extends PacketPlayer {

   public PacketPlayerPosition() {
      this.g = true;
   }

   public PacketPlayerPosition(double arg_0, double arg_2, double var5, boolean var7) {
      this.a = arg_0;
      this.b = arg_2;
      this.c = var5;
      this.f = var7;
      this.g = true;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readDouble();
      this.b = in.readDouble();
      this.c = in.readDouble();
      super.read(in);
   }

   public void write(PacketByteBuf out) {
      out.writeDouble(this.a);
      out.writeDouble(this.b);
      out.writeDouble(this.c);
      super.write(out);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      super.handle((PacketHandlerPlayServerbound)handler);
   }
}
