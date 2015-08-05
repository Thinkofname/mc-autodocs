package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketRemoveEntityEffect implements Packet {

   private int a;
   private pt b;


   public PacketRemoveEntityEffect() {}

   public PacketRemoveEntityEffect(int arg_0, pt arg_1) {
      this.a = arg_0;
      this.b = arg_1;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = pt.a(in.readUnsignedByte());
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeByte(pt.a(this.b));
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public qa a(afk arg_0) {
      return arg_0.a(this.a);
   }

   public pt a() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
