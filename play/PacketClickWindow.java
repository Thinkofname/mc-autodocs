package net.minecraft.network.play;

import net.minecraft.inventory.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketClickWindow implements Packet {

   private int a;
   private int b;
   private int c;
   private short d;
   private ItemStack e;
   private int f;


   public void a(lo arg_0) {
      arg_0.a(this);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readByte();
      this.b = in.readShort();
      this.c = in.readByte();
      this.d = in.readShort();
      this.f = in.readByte();
      this.e = in.readItemStack();
   }

   public void write(PacketByteBuf out) {
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
   public void handle(PacketHandler arg_0) {
      this.a((lo)arg_0);
   }
}
