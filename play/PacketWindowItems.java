package net.minecraft.network.play;

import java.util.List;
import net.minecraft.inventory.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketWindowItems implements Packet {

   private int a;
   private ItemStack[] b;


   public PacketWindowItems() {}

   public PacketWindowItems(int arg_0, List arg_1) {
      this.a = arg_0;
      this.b = new ItemStack[arg_1.size()];

      for(int var3 = 0; var3 < this.b.length; ++var3) {
         ItemStack var4 = (ItemStack)arg_1.get(var3);
         this.b[var3] = var4 == null?null:var4.k();
      }

   }

   public void read(PacketByteBuf in) {
      this.a = in.readUnsignedByte();
      short var2 = in.readShort();
      this.b = new ItemStack[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.b[var3] = in.readItemStack();
      }

   }

   public void write(PacketByteBuf out) {
      out.writeByte(this.a);
      out.writeShort(this.b.length);
      ItemStack[] var2 = this.b;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         ItemStack var5 = var2[var4];
         out.writeItemStack(var5);
      }

   }

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}
