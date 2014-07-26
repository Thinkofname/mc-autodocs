package net.minecraft.network.play;

import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketUpdateBlockEntity implements Packet {

   private Position a;
   private int b;
   private fl c;


   public PacketUpdateBlockEntity() {}

   public PacketUpdateBlockEntity(Position arg_0, int arg_1, fl arg_2) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readPosition();
      this.b = in.readUnsignedByte();
      this.c = in.g();
   }

   public void write(PacketByteBuf out) {
      out.writePosition(this.a);
      out.writeByte((byte)this.b);
      out.a(this.c);
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
