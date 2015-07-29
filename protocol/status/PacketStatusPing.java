package net.minecraft.network.status;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerStatusServerbound;

public class PacketStatusPing implements Packet {

   private long a;


   public PacketStatusPing() {}

   public PacketStatusPing(long arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readLong();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeLong(this.a);
   }

   public void handle(PacketHandlerStatusServerbound handler) {
      handler.handle(this);
   }

   public long a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerStatusServerbound)handler);
   }
}
