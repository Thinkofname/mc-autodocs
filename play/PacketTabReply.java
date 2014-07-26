package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketTabReply implements Packet {

   private String[] a;


   public PacketTabReply() {}

   public PacketTabReply(String[] arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.a = new String[in.readVarInt()];

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = in.readString(32767);
      }

   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a.length);
      String[] var2 = this.a;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = var2[var4];
         out.writeString(var5);
      }

   }

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}
