package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketUpdateScore implements Packet {

   private String a = "";
   private String b = "";
   private int c;
   private lf d;


   public PacketUpdateScore() {}

   public PacketUpdateScore(brt arg_0) {
      this.a = arg_0.e();
      this.b = arg_0.d().b();
      this.c = arg_0.c();
      this.d = lf.CHANGE;
   }

   public PacketUpdateScore(String arg_0) {
      this.a = arg_0;
      this.b = "";
      this.c = 0;
      this.d = lf.REMOVE;
   }

   public PacketUpdateScore(String arg_0, brr arg_1) {
      this.a = arg_0;
      this.b = arg_1.b();
      this.c = 0;
      this.d = lf.REMOVE;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readString(40);
      this.d = (lf)in.readEnum(lf.class);
      this.b = in.readString(16);
      if(this.d != lf.REMOVE) {
         this.c = in.readVarInt();
      }

   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a);
      out.writeEnum(this.d);
      out.writeString(this.b);
      if(this.d != lf.REMOVE) {
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
