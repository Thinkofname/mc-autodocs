package net.minecraft.network.status;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerStatusServerbound;

public class PacketStatusPing implements Packet {

   private long a;


   public void read(PacketByteBuf in) {
      this.a = in.readLong();
   }

   public void write(PacketByteBuf out) {
      out.writeLong(this.a);
   }

   public void handle(PacketHandlerStatusServerbound handler) {
      handler.handle(this);
   }

   public long a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerStatusServerbound)handler);
   }
}
