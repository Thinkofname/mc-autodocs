package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;
import net.minecraft.network.enums.ScoreUpdateType;

public class PacketUpdateScore implements Packet {

   private String a = "";
   private String b = "";
   private int c;
   private ScoreUpdateType d;


   public PacketUpdateScore() {}

   public PacketUpdateScore(brx arg_0) {
      this.a = arg_0.e();
      this.b = arg_0.d().b();
      this.c = arg_0.c();
      this.d = ScoreUpdateType.CHANGE;
   }

   public PacketUpdateScore(String arg_0) {
      this.a = arg_0;
      this.b = "";
      this.c = 0;
      this.d = ScoreUpdateType.REMOVE;
   }

   public PacketUpdateScore(String arg_0, brv arg_1) {
      this.a = arg_0;
      this.b = arg_1.b();
      this.c = 0;
      this.d = ScoreUpdateType.REMOVE;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readString(40);
      this.d = (ScoreUpdateType)in.readEnum(ScoreUpdateType.class);
      this.b = in.readString(16);
      if(this.d != ScoreUpdateType.REMOVE) {
         this.c = in.readVarInt();
      }

   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a);
      out.writeEnum(this.d);
      out.writeString(this.b);
      if(this.d != ScoreUpdateType.REMOVE) {
         out.writeVarInt(this.c);
      }

   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public ScoreUpdateType d() {
      return this.d;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
