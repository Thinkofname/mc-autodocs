package net.minecraft.network.play;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.play.PacketPlayer;

public class PacketPlayerPosition extends PacketPlayer {

   public PacketPlayerPosition() {
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
   public void handle(PacketHandler arg_0) {
      super.a((lo)arg_0);
   }
}
