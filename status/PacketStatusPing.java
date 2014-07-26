package net.minecraft.network.status;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketStatusPing implements Packet {

   private long a;


   public void read(PacketByteBuf in) {
      this.a = in.readLong();
   }

   public void write(PacketByteBuf out) {
      out.writeLong(this.a);
   }

   public void a(np arg_0) {
      arg_0.a(this);
   }

   public long a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((np)arg_0);
   }
}
