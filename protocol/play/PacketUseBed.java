package net.minecraft.network.play;

import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketUseBed implements Packet {

   private int a;
   private Position b;


   public PacketUseBed() {}

   public PacketUseBed(aha arg_0, Position arg_1) {
      this.a = arg_0.F();
      this.b = arg_1;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = in.readPosition();
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writePosition(this.b);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public aha a(aqr arg_0) {
      return (aha)arg_0.a(this.a);
   }

   public Position a() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
