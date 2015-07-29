package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.inventory.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketClickWindow implements Packet {

   private int a;
   private int b;
   private int c;
   private short d;
   private ItemStack e;
   private int f;


   public PacketClickWindow() {}

   public PacketClickWindow(int arg_0, int arg_1, int arg_2, int arg_3, ItemStack arg_4, short arg_5) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
      this.e = arg_4 != null?arg_4.k():null;
      this.d = arg_5;
      this.f = arg_3;
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readByte();
      this.b = in.readShort();
      this.c = in.readByte();
      this.d = in.readShort();
      this.f = in.readByte();
      this.e = in.readItemStack();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeByte(this.a);
      out.writeShort(this.b);
      out.writeByte(this.c);
      out.writeShort(this.d);
      out.writeByte(this.f);
      out.writeItemStack(this.e);
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public short d() {
      return this.d;
   }

   public ItemStack e() {
      return this.e;
   }

   public int f() {
      return this.f;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
