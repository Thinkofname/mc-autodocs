package net.minecraft.network.play;

import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketBlockChange implements Packet {

   private Position a;
   private bcy b;


   public PacketBlockChange() {}

   public PacketBlockChange(aqa arg_0, Position arg_1) {
      this.a = arg_1;
      this.b = arg_0.p(arg_1);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readPosition();
      this.b = (bcy)asv.d.a(in.readVarInt());
   }

   public void write(PacketByteBuf out) {
      out.writePosition(this.a);
      out.writeVarInt(asv.d.b(this.b));
   }

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}
