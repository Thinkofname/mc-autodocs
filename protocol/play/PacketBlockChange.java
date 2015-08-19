package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.block.Block;
import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketBlockChange implements Packet {

   private Position a;
   private apj b;


   public PacketBlockChange() {}

   public PacketBlockChange(agk arg_0, Position arg_1) {
      this.a = arg_1;
      this.b = arg_0.p(arg_1);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readPosition();
      this.b = (apj)Block.blockMap.a(in.readVarInt());
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writePosition(this.a);
      out.writeVarInt(Block.blockMap.get(this.b));
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public apj a() {
      return this.b;
   }

   public Position b() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
