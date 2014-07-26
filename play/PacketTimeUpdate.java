package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

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

   public void read(PacketByteBuf in) {
      this.a = in.readLong();
      this.b = in.readLong();
   }

   public void write(PacketByteBuf out) {
      out.writeLong(this.a);
      out.writeLong(this.b);
   }

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}
