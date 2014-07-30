package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketClientStatus implements Packet {

   private lt a;


   public PacketClientStatus() {}

   public PacketClientStatus(lt arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.a = (lt)in.readEnum(lt.class);
   }

   public void write(PacketByteBuf out) {
      out.writeEnum(this.a);
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public lt a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
