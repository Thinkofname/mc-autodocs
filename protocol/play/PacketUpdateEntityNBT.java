package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketUpdateEntityNBT implements Packet {

   private int a;
   private fm b;


   public PacketUpdateEntityNBT() {}

   public PacketUpdateEntityNBT(int arg_0, fm arg_1) {
      this.a = arg_0;
      this.b = arg_1;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = in.h();
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.a(this.b);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public fm a() {
      return this.b;
   }

   public wu a(aqo arg_0) {
      return arg_0.a(this.a);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
