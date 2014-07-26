package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketUpdateScore implements Packet {

   private String a = "";
   private String b = "";
   private int c;
   private lc d;


   public PacketUpdateScore() {}

   public PacketUpdateScore(bqv arg_0) {
      this.a = arg_0.e();
      this.b = arg_0.d().b();
      this.c = arg_0.c();
      this.d = lc.a;
   }

   public PacketUpdateScore(String arg_0) {
      this.a = arg_0;
      this.b = "";
      this.c = 0;
      this.d = lc.b;
   }

   public PacketUpdateScore(String arg_0, bqt arg_1) {
      this.a = arg_0;
      this.b = arg_1.b();
      this.c = 0;
      this.d = lc.b;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readString(40);
      this.d = (lc)in.readEnum(lc.class);
      this.b = in.readString(16);
      if(this.d != lc.b) {
         this.c = in.readVarInt();
      }

   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a);
      out.writeEnum(this.d);
      out.writeString(this.b);
      if(this.d != lc.b) {
         out.writeVarInt(this.c);
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
