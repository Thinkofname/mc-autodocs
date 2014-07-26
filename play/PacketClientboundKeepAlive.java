package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketClientboundKeepAlive implements Packet {

   private int a;


   public PacketClientboundKeepAlive() {}

   public PacketClientboundKeepAlive(int arg_0) {
      this.a = arg_0;
   }

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readInt();
   }

   public void write(PacketByteBuf out) {
      out.writeInt(this.a);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}
