package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketChangeHeldItem implements Packet {

   private int a;


   public PacketChangeHeldItem() {}

   public PacketChangeHeldItem(int arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readByte();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeByte(this.a);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public int a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
