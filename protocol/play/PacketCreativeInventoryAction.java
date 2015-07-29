package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.inventory.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketCreativeInventoryAction implements Packet {

   private int a;
   private ItemStack b;


   public PacketCreativeInventoryAction() {}

   public PacketCreativeInventoryAction(int arg_0, ItemStack arg_1) {
      this.a = arg_0;
      this.b = arg_1 != null?arg_1.k():null;
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readShort();
      this.b = in.readItemStack();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeShort(this.a);
      out.writeItemStack(this.b);
   }

   public int a() {
      return this.a;
   }

   public ItemStack b() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
