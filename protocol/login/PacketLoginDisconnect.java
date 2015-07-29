package net.minecraft.network.login;

import java.io.IOException;
import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerLoginClientbound;

public class PacketLoginDisconnect implements Packet {

   private IChatMessage a;


   public PacketLoginDisconnect() {}

   public PacketLoginDisconnect(IChatMessage arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readChat();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeChat(this.a);
   }

   public void handle(PacketHandlerLoginClientbound handler) {
      handler.handle(this);
   }

   public IChatMessage a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerLoginClientbound)handler);
   }
}
