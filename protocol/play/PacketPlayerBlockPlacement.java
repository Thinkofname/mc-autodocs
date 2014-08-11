package net.minecraft.network.play;

import net.minecraft.inventory.ItemStack;
import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketPlayerBlockPlacement implements Packet {

   private static final Position a = new Position(-1, -1, -1);
   private Position b;
   private int c;
   private ItemStack d;
   private float e;
   private float f;
   private float g;


   public PacketPlayerBlockPlacement() {}

   public PacketPlayerBlockPlacement(ItemStack arg_0) {
      this(a, 255, arg_0, 0.0F, 0.0F, 0.0F);
   }

   public PacketPlayerBlockPlacement(Position arg_0, int arg_1, ItemStack arg_2, float arg_3, float arg_4, float arg_5) {
      this.b = arg_0;
      this.c = arg_1;
      this.d = arg_2 != null?arg_2.k():null;
      this.e = arg_3;
      this.f = arg_4;
      this.g = arg_5;
   }

   public void read(PacketByteBuf in) {
      this.b = in.readPosition();
      this.c = in.readUnsignedByte();
      this.d = in.readItemStack();
      this.e = (float)in.readUnsignedByte() / 16.0F;
      this.f = (float)in.readUnsignedByte() / 16.0F;
      this.g = (float)in.readUnsignedByte() / 16.0F;
   }

   public void write(PacketByteBuf out) {
      out.writePosition(this.b);
      out.writeByte(this.c);
      out.writeItemStack(this.d);
      out.writeByte((int)(this.e * 16.0F));
      out.writeByte((int)(this.f * 16.0F));
      out.writeByte((int)(this.g * 16.0F));
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public Position a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public ItemStack c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }

   public float e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }

}
