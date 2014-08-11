package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

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

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public int[] a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
