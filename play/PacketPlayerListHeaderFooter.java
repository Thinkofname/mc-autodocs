package net.minecraft.network.play;

import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketPlayerListHeaderFooter implements Packet {

   private IChatMessage a;
   private IChatMessage b;


   public PacketPlayerListHeaderFooter() {}

   public PacketPlayerListHeaderFooter(IChatMessage arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readChat();
      this.b = in.readChat();
   }

   public void write(PacketByteBuf out) {
      out.writeChat(this.a);
      out.writeChat(this.b);
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
