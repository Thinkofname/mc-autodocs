package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketCheckTransaction implements Packet {

   private int a;
   private short b;
   private boolean c;


   public void a(lo arg_0) {
      arg_0.a(this);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readByte();
      this.b = in.readShort();
      this.c = in.readByte() != 0;
   }

   public void write(PacketByteBuf out) {
      out.writeByte(this.a);
      out.writeShort(this.b);
      out.writeByte(this.c?1:0);
   }

   public int a() {
      return this.a;
   }

   public short b() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((lo)arg_0);
   }
}
