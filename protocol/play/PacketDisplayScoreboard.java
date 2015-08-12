package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketDisplayScoreboard implements Packet {

   private int a;
   private String b;


   public PacketDisplayScoreboard() {}

   public PacketDisplayScoreboard(int arg_0, axz arg_1) {
      this.a = arg_0;
      if(arg_1 == null) {
         this.b = "";
      } else {
         this.b = arg_1.b();
      }

   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readByte();
      this.b = in.readString(16);
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeByte(this.a);
      out.writeString(this.b);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public int a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
