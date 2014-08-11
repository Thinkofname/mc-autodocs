package net.minecraft.network.play;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;
import net.minecraft.network.play.PacketPlayer;

public class PacketPlayerLook extends PacketPlayer {

   public PacketPlayerLook() {
      this.h = true;
   }

   public PacketPlayerLook(float arg_0, float arg_1, boolean arg_2) {
      this.d = arg_0;
      this.e = arg_1;
      this.f = arg_2;
      this.h = true;
   }

   public void read(PacketByteBuf in) {
      this.d = in.readFloat();
      this.e = in.readFloat();
      super.read(in);
   }

   public void write(PacketByteBuf out) {
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
