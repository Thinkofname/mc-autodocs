package net.minecraft.network.play;

import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketPlayerDigging implements Packet {

   private Position a;
   private ek b;
   private mk c;


   public void read(PacketByteBuf in) {
      this.c = (mk)in.readEnum(mk.class);
      this.a = in.readPosition();
      this.b = ek.a(in.readUnsignedByte());
   }

   public void write(PacketByteBuf out) {
      out.writeEnum(this.c);
      out.writePosition(this.a);
      out.writeByte(this.b.a());
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public Position a() {
      return this.a;
   }

   public ek b() {
      return this.b;
   }

   public mk c() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
