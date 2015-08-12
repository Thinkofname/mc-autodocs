package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketRemoveEntityEffect implements Packet {

   private int a;
   private qj b;


   public PacketRemoveEntityEffect() {}

   public PacketRemoveEntityEffect(int arg_0, qj arg_1) {
      this.a = arg_0;
      this.b = arg_1;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = qj.a(in.readUnsignedByte());
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeByte(qj.a(this.b));
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public qq a(agc arg_0) {
      return arg_0.a(this.a);
   }

   public qj a() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
