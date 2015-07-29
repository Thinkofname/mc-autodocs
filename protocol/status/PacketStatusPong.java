package net.minecraft.network.status;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerStatusClientbound;

public class PacketStatusPong implements Packet {

   private long a;


   public PacketStatusPong() {}

   public PacketStatusPong(long arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readLong();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeLong(this.a);
   }

   public void handle(PacketHandlerStatusClientbound handler) {
      handler.handle(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerStatusClientbound)handler);
   }
}
