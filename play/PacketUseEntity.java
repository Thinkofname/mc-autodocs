package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketUseEntity implements Packet {

   private int a;
   private ma b;


   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = (ma)in.readEnum(ma.class);
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeEnum(this.b);
   }

   public void a(lo arg_0) {
      arg_0.a(this);
   }

   public wk a(aqa arg_0) {
      return arg_0.a(this.a);
   }

   public ma a() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((lo)arg_0);
   }
}
