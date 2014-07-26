package net.minecraft.network.login;

import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketLoginDisconnect implements Packet {

   private IChatMessage a;


   public PacketLoginDisconnect() {}

   public PacketLoginDisconnect(IChatMessage arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readChat();
   }

   public void write(PacketByteBuf out) {
      out.writeChat(this.a);
   }

   public void a(mw arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((mw)arg_0);
   }
}
