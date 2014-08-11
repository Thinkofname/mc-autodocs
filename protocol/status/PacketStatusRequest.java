package net.minecraft.network.status;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerStatusServerbound;

public class PacketStatusRequest implements Packet {

   public void read(PacketByteBuf in) {}

   public void write(PacketByteBuf out) {}

   public void handle(PacketHandlerStatusServerbound handler) {
      handler.handle(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerStatusServerbound)handler);
   }
}
