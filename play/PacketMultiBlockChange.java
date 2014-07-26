package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketMultiBlockChange implements Packet {

   private apt a;
   private iz[] b;


   public PacketMultiBlockChange() {}

   public PacketMultiBlockChange(int arg_0, short[] arg_1, bed arg_2) {
      this.a = new apt(arg_2.a, arg_2.b);
      this.b = new iz[arg_0];

      for(int var4 = 0; var4 < this.b.length; ++var4) {
         this.b[var4] = new iz(this, arg_1[var4], arg_2);
      }

   }

   public void read(PacketByteBuf in) {
      this.a = new apt(in.readInt(), in.readInt());
      this.b = new iz[in.readVarInt()];

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         this.b[var2] = new iz(this, in.readShort(), (bcy)asv.d.a(in.readVarInt()));
      }

   }

   public void write(PacketByteBuf out) {
      out.writeInt(this.a.a);
      out.writeInt(this.a.b);
      out.writeVarInt(this.b.length);
      iz[] var2 = this.b;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         iz var5 = var2[var4];
         out.writeShort(var5.b());
         out.writeVarInt(asv.d.b(var5.c()));
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

   // $FF: synthetic method
   public static apt a(PacketMultiBlockChange arg_0) {
      return arg_0.a;
   }
}
