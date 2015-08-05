package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketAnimation implements Packet {

   private int a;
   private int b;


   public PacketAnimation() {}

   public PacketAnimation(qa arg_0, int arg_1) {
      this.a = arg_0.F();
      this.b = arg_1;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = in.readUnsignedByte();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeByte(this.b);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
