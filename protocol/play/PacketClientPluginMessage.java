package net.minecraft.network.play;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketClientPluginMessage implements Packet {

   private String a;
   private PacketByteBuf b;


   public PacketClientPluginMessage() {}

   public PacketClientPluginMessage(String arg_0, PacketByteBuf arg_1) {
      this.a = arg_0;
      this.b = arg_1;
      if(arg_1.writerIndex() > 32767) {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readString(20);
      int var2 = in.readableBytes();
      if(var2 >= 0 && var2 <= 32767) {
         this.b = new PacketByteBuf(in.readBytes(var2));
      } else {
         throw new IOException("Payload may not be larger than 32767 bytes");
      }
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeString(this.a);
      out.writeBytes((ByteBuf)this.b);
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public String a() {
      return this.a;
   }

   public PacketByteBuf b() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
