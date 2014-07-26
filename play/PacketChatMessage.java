package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketChatMessage implements Packet {

   private String a;


   public PacketChatMessage() {}

   public PacketChatMessage(String arg_0) {
      if(arg_0.length() > 100) {
         arg_0 = arg_0.substring(0, 100);
      }

      this.a = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readString(100);
   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a);
   }

   public void a(lo arg_0) {
      arg_0.a(this);
   }

   public String a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((lo)arg_0);
   }
}
