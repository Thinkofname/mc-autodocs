package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketTimeUpdate implements Packet {

   private long a;
   private long b;


   public PacketTimeUpdate() {}

   public PacketTimeUpdate(long arg_0, long arg_2, boolean var5) {
      this.a = arg_0;
      this.b = arg_2;
      if(!var5) {
         this.b = -this.b;
         if(this.b == 0L) {
            this.b = -1L;
         }
      }

   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readLong();
      this.b = in.readLong();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeLong(this.a);
      out.writeLong(this.b);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public long a() {
      return this.a;
   }

   public long b() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
