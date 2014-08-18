package net.minecraft.network.play;

import net.minecraft.block.Block;
import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketBlockChange implements Packet {

   private Position a;
   private bdz b;


   public PacketBlockChange() {}

   public PacketBlockChange(aqr arg_0, Position arg_1) {
      this.a = arg_1;
      this.b = arg_0.p(arg_1);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readPosition();
      this.b = (bdz)Block.blockMap.a(in.readVarInt());
   }

   public void write(PacketByteBuf out) {
      out.writePosition(this.a);
      out.writeVarInt(Block.blockMap.get(this.b));
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public bdz a() {
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
