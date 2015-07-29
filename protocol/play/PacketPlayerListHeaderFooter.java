package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketPlayerListHeaderFooter implements Packet {

   private IChatMessage a;
   private IChatMessage b;


   public PacketPlayerListHeaderFooter() {}

   public PacketPlayerListHeaderFooter(IChatMessage arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readChat();
      this.b = in.readChat();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeChat(this.a);
      out.writeChat(this.b);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public IChatMessage a() {
      return this.a;
   }

   public IChatMessage b() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
