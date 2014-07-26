package net.minecraft.network.play;

import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketPlayerDigging implements Packet {

   private Position a;
   private ek b;
   private mi c;


   public void read(PacketByteBuf in) {
      this.c = (mi)in.readEnum(mi.class);
      this.a = in.readPosition();
      this.b = ek.a(in.readUnsignedByte());
   }

   public void write(PacketByteBuf out) {
      out.writeEnum(this.c);
      out.writePosition(this.a);
      out.writeByte(this.b.a());
   }

   public void a(lo arg_0) {
      arg_0.a(this);
   }

   public Position a() {
      return this.a;
   }

   public ek b() {
      return this.b;
   }

   public mi c() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((lo)arg_0);
   }
}
