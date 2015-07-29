package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketSignEditorOpen implements Packet {

   private Position a;


   public PacketSignEditorOpen() {}

   public PacketSignEditorOpen(Position arg_0) {
      this.a = arg_0;
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readPosition();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writePosition(this.a);
   }

   public Position a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
