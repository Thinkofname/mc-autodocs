package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketMultiBlockChange implements Packet {

   private aqf a;
   private ja[] b;


   public PacketMultiBlockChange() {}

   public PacketMultiBlockChange(int arg_0, short[] arg_1, bez arg_2) {
      this.a = new aqf(arg_2.a, arg_2.b);
      this.b = new ja[arg_0];

      for(int var4 = 0; var4 < this.b.length; ++var4) {
         this.b[var4] = new ja(this, arg_1[var4], arg_2);
      }

   }

   public void read(PacketByteBuf in) {
      this.a = new aqf(in.readInt(), in.readInt());
      this.b = new ja[in.readVarInt()];

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         this.b[var2] = new ja(this, in.readShort(), (bdu)atk.d.a(in.readVarInt()));
      }

   }

   public void write(PacketByteBuf out) {
      out.writeInt(this.a.a);
      out.writeInt(this.a.b);
      out.writeVarInt(this.b.length);
      ja[] var2 = this.b;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         ja var5 = var2[var4];
         out.writeShort(var5.b());
         out.writeVarInt(atk.d.b(var5.c()));
      }

   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }

   // $FF: synthetic method
   public static aqf a(PacketMultiBlockChange arg_0) {
      return arg_0.a;
   }
}
