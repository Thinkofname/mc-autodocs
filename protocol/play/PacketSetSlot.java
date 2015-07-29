package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.inventory.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

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

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readByte();
      this.b = in.readShort();
      this.c = in.readItemStack();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeByte(this.a);
      out.writeShort(this.b);
      out.writeItemStack(this.c);
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public ItemStack c() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
