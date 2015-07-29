package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.chat.IChatMessage;
import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketUpdateSign implements Packet {

   private Position a;
   private IChatMessage[] b;


   public PacketUpdateSign() {}

   public PacketUpdateSign(Position arg_0, IChatMessage[] arg_1) {
      this.a = arg_0;
      this.b = new IChatMessage[]{arg_1[0], arg_1[1], arg_1[2], arg_1[3]};
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readPosition();
      this.b = new IChatMessage[4];

      for(int var2 = 0; var2 < 4; ++var2) {
         String var3 = in.readString(384);
         IChatMessage var4 = eu$a.a(var3);
         this.b[var2] = var4;
      }

   }

   public void write(PacketByteBuf out) throws IOException {
      out.writePosition(this.a);

      for(int var2 = 0; var2 < 4; ++var2) {
         IChatMessage var3 = this.b[var2];
         String var4 = eu$a.a(var3);
         out.writeString(var4);
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
