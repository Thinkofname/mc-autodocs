package net.minecraft.network.play;

import net.minecraft.chat.IChatMessage;
import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketUpdateSign implements Packet {

   private Position a;
   private IChatMessage[] b;


   public void read(PacketByteBuf in) {
      this.a = in.readPosition();
      this.b = new IChatMessage[4];

      for(int var2 = 0; var2 < 4; ++var2) {
         this.b[var2] = in.readChat();
      }

   }

   public void write(PacketByteBuf out) {
      out.writePosition(this.a);

      for(int var2 = 0; var2 < 4; ++var2) {
         out.writeChat(this.b[var2]);
      }

   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public Position a() {
      return this.a;
   }

   public IChatMessage[] b() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
