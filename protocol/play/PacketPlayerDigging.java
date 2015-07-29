package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;
import net.minecraft.network.enums.BlockFace;
import net.minecraft.network.enums.DiggingType;

public class PacketPlayerDigging implements Packet {

   private Position a;
   private BlockFace b;
   private DiggingType c;


   public PacketPlayerDigging() {}

   public PacketPlayerDigging(DiggingType arg_0, Position arg_1, BlockFace arg_2) {
      this.c = arg_0;
      this.a = arg_1;
      this.b = arg_2;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.c = (DiggingType)in.readEnum(DiggingType.class);
      this.a = in.readPosition();
      this.b = BlockFace.a(in.readUnsignedByte());
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeEnum(this.c);
      out.writePosition(this.a);
      out.writeByte(this.b.a());
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public Position a() {
      return this.a;
   }

   public BlockFace b() {
      return this.b;
   }

   public DiggingType c() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
