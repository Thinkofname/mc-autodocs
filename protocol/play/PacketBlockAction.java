package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.block.Block;
import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketBlockAction implements Packet {

   private Position a;
   private int b;
   private int c;
   private Block d;


   public PacketBlockAction() {}

   public PacketBlockAction(Position arg_0, Block arg_1, int arg_2, int arg_3) {
      this.a = arg_0;
      this.b = arg_2;
      this.c = arg_3;
      this.d = arg_1;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readPosition();
      this.b = in.readUnsignedByte();
      this.c = in.readUnsignedByte();
      this.d = Block.c(in.readVarInt() & 4095);
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writePosition(this.a);
      out.writeByte(this.b);
      out.writeByte(this.c);
      out.writeVarInt(Block.a(this.d) & 4095);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public Position a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public Block d() {
      return this.d;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
