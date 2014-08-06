package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketClientStatus implements Packet {

   private lu a;


   public PacketClientStatus() {}

   public PacketClientStatus(lu arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.a = (lu)in.readEnum(lu.class);
   }

   public void write(PacketByteBuf out) {
      out.writeEnum(this.a);
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public lu a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
