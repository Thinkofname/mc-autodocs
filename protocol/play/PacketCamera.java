package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketCamera implements Packet {

   public int a;


   public PacketCamera() {}

   public PacketCamera(wv arg_0) {
      this.a = arg_0.F();
   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public wv a(aqs arg_0) {
      return arg_0.a(this.a);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
