package net.minecraft.network.play;

import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketBlockAction implements Packet {

   private Position a;
   private int b;
   private int c;
   private asv d;


   public PacketBlockAction() {}

   public PacketBlockAction(Position arg_0, asv arg_1, int arg_2, int arg_3) {
      this.a = arg_0;
      this.b = arg_2;
      this.c = arg_3;
      this.d = arg_1;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readPosition();
      this.b = in.readUnsignedByte();
      this.c = in.readUnsignedByte();
      this.d = asv.d(in.readVarInt() & 4095);
   }

   public void write(PacketByteBuf out) {
      out.writePosition(this.a);
      out.writeByte(this.b);
      out.writeByte(this.c);
      out.writeVarInt(asv.a(this.d) & 4095);
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
