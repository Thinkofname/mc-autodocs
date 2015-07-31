package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketEnchantItem implements Packet {

   private int a;
   private int b;


   public PacketEnchantItem() {}

   public PacketEnchantItem(int arg_0, int arg_1) {
      this.a = arg_0;
      this.b = arg_1;
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readByte();
      this.b = in.readByte();
   }

   public void write(PacketByteBuf out) throws IOException {
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
