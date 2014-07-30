package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketUseEntity implements Packet {

   private int a;
   private mb b;


   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = (mb)in.readEnum(mb.class);
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeEnum(this.b);
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public wq a(aqh arg_0) {
      return arg_0.a(this.a);
   }

   public mb a() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
