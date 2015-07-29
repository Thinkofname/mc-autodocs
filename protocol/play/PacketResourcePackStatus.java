package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;
import net.minecraft.network.enums.ResourcePackStatus;

public class PacketResourcePackStatus implements Packet {

   private String a;
   private ResourcePackStatus b;


   public PacketResourcePackStatus() {}

   public PacketResourcePackStatus(String arg_0, ResourcePackStatus arg_1) {
      if(arg_0.length() > 40) {
         arg_0 = arg_0.substring(0, 40);
      }

      this.a = arg_0;
      this.b = arg_1;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readString(40);
      this.b = (ResourcePackStatus)in.readEnum(ResourcePackStatus.class);
   }

   public void write(PacketByteBuf out) throws IOException {
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
