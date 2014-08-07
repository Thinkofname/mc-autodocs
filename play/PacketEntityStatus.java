package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketEntityStatus implements Packet {

   private int a;
   private byte b;


   public PacketEntityStatus() {}

   public PacketEntityStatus(wt arg_0, byte arg_1) {
      this.a = arg_0.E();
      this.b = arg_1;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readInt();
      this.b = in.readByte();
   }

   public void write(PacketByteBuf out) {
      out.writeInt(this.a);
      out.writeByte(this.b);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
