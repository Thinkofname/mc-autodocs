package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.inventory.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;
import net.minecraft.network.enums.EquipmentSlot;

public class PacketEntityEquipment implements Packet {

   private int a;
   private EquipmentSlot b;
   private ItemStack c;


   public PacketEntityEquipment() {}

   public PacketEntityEquipment(int arg_0, EquipmentSlot arg_1, ItemStack arg_2) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2 == null?null:arg_2.k();
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = (EquipmentSlot)in.readEnum(EquipmentSlot.class);
      this.c = in.readItemStack();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeEnum(this.b);
      out.writeItemStack(this.c);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public ItemStack a() {
      return this.c;
   }

   public int b() {
      return this.a;
   }

   public EquipmentSlot c() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
