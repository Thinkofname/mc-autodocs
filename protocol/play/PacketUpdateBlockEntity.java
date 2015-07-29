package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketUpdateBlockEntity implements Packet {

   private Position a;
   private int b;
   private dn c;


   public PacketUpdateBlockEntity() {}

   public PacketUpdateBlockEntity(Position arg_0, int arg_1, dn arg_2) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readPosition();
      this.b = in.readUnsignedByte();
      this.c = in.h();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writePosition(this.a);
      out.writeByte((byte)this.b);
      out.a(this.c);
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

   public dn c() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
