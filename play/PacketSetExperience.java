package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketSetExperience implements Packet {

   private float a;
   private int b;
   private int c;


   public PacketSetExperience() {}

   public PacketSetExperience(float arg_0, int arg_1, int arg_2) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readFloat();
      this.c = in.readVarInt();
      this.b = in.readVarInt();
   }

   public void write(PacketByteBuf out) {
      out.writeFloat(this.a);
      out.writeVarInt(this.c);
      out.writeVarInt(this.b);
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
