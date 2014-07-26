package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketClientStatus implements Packet {

   private ls a;


   public PacketClientStatus() {}

   public PacketClientStatus(ls arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.a = (ls)in.readEnum(ls.class);
   }

   public void write(PacketByteBuf out) {
      out.writeEnum(this.a);
   }

   public void a(lo arg_0) {
      arg_0.a(this);
   }

   public ls a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((lo)arg_0);
   }
}
