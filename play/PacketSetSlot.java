package net.minecraft.network.play;

import net.minecraft.inventory.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketSetSlot implements Packet {

   private int a;
   private int b;
   private ItemStack c;


   public PacketSetSlot() {}

   public PacketSetSlot(int arg_0, int arg_1, ItemStack arg_2) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2 == null?null:arg_2.k();
   }

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readByte();
      this.b = in.readShort();
      this.c = in.readItemStack();
   }

   public void write(PacketByteBuf out) {
      out.writeByte(this.a);
      out.writeShort(this.b);
      out.writeItemStack(this.c);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}
