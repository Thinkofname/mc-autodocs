package net.minecraft.network.play;

import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketSignEditorOpen implements Packet {

   private Position a;


   public PacketSignEditorOpen() {}

   public PacketSignEditorOpen(Position arg_0) {
      this.a = arg_0;
   }

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readPosition();
   }

   public void write(PacketByteBuf out) {
      out.writePosition(this.a);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}
