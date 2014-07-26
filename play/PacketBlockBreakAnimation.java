package net.minecraft.network.play;

import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketBlockBreakAnimation implements Packet {

   private int a;
   private Position b;
   private int c;


   public PacketBlockBreakAnimation() {}

   public PacketBlockBreakAnimation(int arg_0, Position arg_1, int arg_2) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = in.readPosition();
      this.c = in.readUnsignedByte();
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writePosition(this.b);
      out.writeByte(this.c);
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
