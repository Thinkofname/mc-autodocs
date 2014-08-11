package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketUpdateHealth implements Packet {

   private float a;
   private int b;
   private float c;


   public PacketUpdateHealth() {}

   public PacketUpdateHealth(float arg_0, int arg_1, float arg_2) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readFloat();
      this.b = in.readVarInt();
      this.c = in.readFloat();
   }

   public void write(PacketByteBuf out) {
      out.writeFloat(this.a);
      out.writeVarInt(this.b);
      out.writeFloat(this.c);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public float a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public float c() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
