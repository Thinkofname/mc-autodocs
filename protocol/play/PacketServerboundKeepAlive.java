package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketServerboundKeepAlive implements Packet {

   private int a;


   public PacketServerboundKeepAlive() {}

   public PacketServerboundKeepAlive(int arg_0) {
      this.a = arg_0;
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
   }

   public int a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
