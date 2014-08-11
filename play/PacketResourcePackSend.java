package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketResourcePackSend implements Packet {

   private String a;
   private String b;


   public PacketResourcePackSend() {}

   public PacketResourcePackSend(String arg_0, String arg_1) {
      this.a = arg_0;
      this.b = arg_1;
      if(arg_1.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + arg_1.length() + ")");
      }
   }

   public void read(PacketByteBuf in) {
      this.a = in.readString(32767);
      this.b = in.readString(40);
   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a);
      out.writeString(this.b);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public String a() {
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
