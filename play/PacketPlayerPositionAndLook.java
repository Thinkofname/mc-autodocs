package net.minecraft.network.play;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.play.PacketPlayer;

public class PacketPlayerPositionAndLook extends PacketPlayer {

   public PacketPlayerPositionAndLook() {
      this.g = true;
      this.h = true;
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
   public void handle(PacketHandler arg_0) {
      super.a((lo)arg_0);
   }
}
