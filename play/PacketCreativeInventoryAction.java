package net.minecraft.network.play;

import net.minecraft.inventory.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketCreativeInventoryAction implements Packet {

   private int a;
   private ItemStack b;


   public void a(lo arg_0) {
      arg_0.a(this);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readShort();
      this.b = in.readItemStack();
   }

   public void write(PacketByteBuf out) {
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
   public void handle(PacketHandler arg_0) {
      this.a((lo)arg_0);
   }
}
