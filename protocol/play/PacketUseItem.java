package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;
import net.minecraft.network.enums.PlayerHand;

public class PacketUseItem implements Packet {

   private PlayerHand a;


   public PacketUseItem() {}

   public PacketUseItem(PlayerHand arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = (PlayerHand)in.readEnum(PlayerHand.class);
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeEnum(this.a);
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public PlayerHand a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
