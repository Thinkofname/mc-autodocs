package net.minecraft.network.status;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketStatusRequest implements Packet {

   public void read(PacketByteBuf in) {}

   public void write(PacketByteBuf out) {}

   public void a(np arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((np)arg_0);
   }
}
