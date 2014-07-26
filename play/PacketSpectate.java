package net.minecraft.network.play;

import java.util.UUID;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketSpectate implements Packet {

   private UUID a;


   public PacketSpectate() {}

   public PacketSpectate(UUID arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readUUID();
   }

   public void write(PacketByteBuf out) {
      out.writeUUID(this.a);
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public wk a(ql arg_0) {
      return arg_0.a(this.a);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
