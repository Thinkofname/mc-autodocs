package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketEntityAction implements Packet {

   private int a;
   private mk b;
   private int c;


   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = (mk)in.readEnum(mk.class);
      this.c = in.readVarInt();
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeEnum(this.b);
      out.writeVarInt(this.c);
   }

   public void a(lo arg_0) {
      arg_0.a(this);
   }

   public mk b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((lo)arg_0);
   }
}
