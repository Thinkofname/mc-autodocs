package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketServerPluginMessage implements Packet {

   private String a;
   private byte[] b;


   public PacketServerPluginMessage() {}

   public PacketServerPluginMessage(String arg_0, PacketByteBuf arg_1) {
      this(arg_0, arg_1.readRemaining());
   }

   public PacketServerPluginMessage(String arg_0, byte[] arg_1) {
      this.a = arg_0;
      this.b = arg_1;
      if(arg_1.length > 1048576) {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   public void read(PacketByteBuf in) {
      this.a = in.readString(20);
      int var2 = in.readVarInt();
      if(var2 >= 0 && var2 <= 1048576) {
         this.b = new byte[var2];
         in.readBytes(this.b);
      } else {
         throw new IOException("Payload may not be larger than 1048576 bytes");
      }
   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a);
      out.writeVarInt(this.b.length);
      out.writeBytes(this.b);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
