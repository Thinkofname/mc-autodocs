package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketScoreboardObjective implements Packet {

   private String a;
   private String b;
   private brg c;
   private int d;


   public PacketScoreboardObjective() {}

   public PacketScoreboardObjective(bqt arg_0, int arg_1) {
      this.a = arg_0.b();
      this.b = arg_0.d();
      this.c = arg_0.c().c();
      this.d = arg_1;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readString(16);
      this.d = in.readByte();
      if(this.d == 0 || this.d == 2) {
         this.b = in.readString(32);
         this.c = brg.a(in.readString(16));
      }

   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a);
      out.writeByte(this.d);
      if(this.d == 0 || this.d == 2) {
         out.writeString(this.b);
         out.writeString(this.c.a());
      }

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