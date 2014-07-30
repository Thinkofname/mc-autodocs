package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketResourcePackStatus implements Packet {

   private String a;
   private mo b;


   public void read(PacketByteBuf in) {
      this.a = in.readString(40);
      this.b = (mo)in.readEnum(mo.class);
   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a);
      out.writeEnum(this.b);
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
