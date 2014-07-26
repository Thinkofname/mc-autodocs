package net.minecraft.network.status;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketStatusPong implements Packet {

   private long a;


   public PacketStatusPong() {}

   public PacketStatusPong(long arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readLong();
   }

   public void write(PacketByteBuf out) {
      out.writeLong(this.a);
   }

   public void a(ng arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ng)arg_0);
   }
}
