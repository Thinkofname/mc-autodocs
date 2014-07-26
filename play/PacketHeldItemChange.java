package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketHeldItemChange implements Packet {

   private int a;


   public void read(PacketByteBuf in) {
      this.a = in.readShort();
   }

   public void write(PacketByteBuf out) {
      out.writeShort(this.a);
   }

   public void a(lo arg_0) {
      arg_0.a(this);
   }

   public int a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((lo)arg_0);
   }
}
