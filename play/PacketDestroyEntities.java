package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketDestroyEntities implements Packet {

   private int[] a;


   public PacketDestroyEntities() {}

   public PacketDestroyEntities(int ... arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.a = new int[in.readVarInt()];

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = in.readVarInt();
      }

   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a.length);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         out.writeVarInt(this.a[var2]);
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
