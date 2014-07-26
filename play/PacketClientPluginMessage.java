package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketClientPluginMessage implements Packet {

   private String a;
   private byte[] b;


   public void read(PacketByteBuf in) {
      this.a = in.readString(20);
      int var2 = in.readVarInt();
      if(var2 >= 0 && var2 <= 32767) {
         this.b = new byte[var2];
         in.readBytes(this.b);
      } else {
         throw new IOException("Payload may not be larger than 32767 bytes");
      }
   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a);
      out.writeVarInt(this.b.length);
      out.writeBytes(this.b);
   }

   public void a(lo arg_0) {
      arg_0.a(this);
   }

   public String a() {
      return this.a;
   }

   public byte[] b() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((lo)arg_0);
   }
}
