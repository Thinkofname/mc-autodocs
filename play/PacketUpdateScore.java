package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketUpdateScore implements Packet {

   private String a = "";
   private String b = "";
   private int c;
   private ld d;


   public PacketUpdateScore() {}

   public PacketUpdateScore(brc arg_0) {
      this.a = arg_0.e();
      this.b = arg_0.d().b();
      this.c = arg_0.c();
      this.d = ld.a;
   }

   public PacketUpdateScore(String arg_0) {
      this.a = arg_0;
      this.b = "";
      this.c = 0;
      this.d = ld.b;
   }

   public PacketUpdateScore(String arg_0, bra arg_1) {
      this.a = arg_0;
      this.b = arg_1.b();
      this.c = 0;
      this.d = ld.b;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readString(40);
      this.d = (ld)in.readEnum(ld.class);
      this.b = in.readString(16);
      if(this.d != ld.b) {
         this.c = in.readVarInt();
      }

   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a);
      out.writeEnum(this.d);
      out.writeString(this.b);
      if(this.d != ld.b) {
         out.writeVarInt(this.c);
      }

   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
