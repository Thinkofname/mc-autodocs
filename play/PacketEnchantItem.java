package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketEnchantItem implements Packet {

   private int a;
   private int b;


   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readByte();
      this.b = in.readByte();
   }

   public void write(PacketByteBuf out) {
      out.writeByte(this.a);
      out.writeByte(this.b);
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
