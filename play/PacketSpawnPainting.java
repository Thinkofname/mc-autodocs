package net.minecraft.network.play;

import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketSpawnPainting implements Packet {

   private int a;
   private Position b;
   private el c;
   private String d;


   public PacketSpawnPainting() {}

   public PacketSpawnPainting(adf arg_0) {
      this.a = arg_0.E();
      this.b = arg_0.m();
      this.c = arg_0.b;
      this.d = arg_0.c.B;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.d = in.readString(adg.A);
      this.b = in.readPosition();
      this.c = el.b(in.readUnsignedByte());
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeString(this.d);
      out.writePosition(this.b);
      out.writeByte(this.c.b());
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
