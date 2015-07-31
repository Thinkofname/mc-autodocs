package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketBlockBreakAnimation implements Packet {

   private int a;
   private Position b;
   private int c;


   public PacketBlockBreakAnimation() {}

   public PacketBlockBreakAnimation(int arg_0, Position arg_1, int arg_2) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = in.readPosition();
      this.c = in.readUnsignedByte();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writePosition(this.b);
      out.writeByte(this.c);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public int a() {
      return this.a;
   }

   public Position b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
