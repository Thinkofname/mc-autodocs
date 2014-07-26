package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketAnimation implements Packet {

   private int a;
   private int b;


   public PacketAnimation() {}

   public PacketAnimation(wk arg_0, int arg_1) {
      this.a = arg_0.E();
      this.b = arg_1;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = in.readUnsignedByte();
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeByte(this.b);
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
