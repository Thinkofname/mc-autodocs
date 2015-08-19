package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;
import net.minecraft.network.enums.BlockFace;

public class PacketSpawnPainting implements Packet {

   private int a;
   private Position b;
   private BlockFace c;
   private String d;


   public PacketSpawnPainting() {}

   public PacketSpawnPainting(wu arg_0) {
      this.a = arg_0.F();
      this.b = arg_0.m();
      this.c = arg_0.b;
      this.d = arg_0.c.B;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.d = in.readString(wu$a.A);
      this.b = in.readPosition();
      this.c = BlockFace.b(in.readUnsignedByte());
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeString(this.d);
      out.writePosition(this.b);
      out.writeByte(this.c.b());
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

   public BlockFace c() {
      return this.c;
   }

   public String d() {
      return this.d;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
