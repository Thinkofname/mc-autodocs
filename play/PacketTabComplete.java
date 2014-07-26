package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import org.apache.commons.lang3.StringUtils;

public class PacketTabComplete implements Packet {

   private String a;


   public PacketTabComplete() {}

   public PacketTabComplete(String arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readString(32767);
   }

   public void write(PacketByteBuf out) {
      out.writeString(StringUtils.substring(this.a, 0, 32767));
   }

   public void a(lo arg_0) {
      arg_0.a(this);
   }

   public String a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((lo)arg_0);
   }
}
