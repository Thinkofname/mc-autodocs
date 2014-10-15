package net.minecraft.network.play;

import net.minecraft.block.Block;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketMultiBlockChange implements Packet {

   private aqj a;
   private jc[] b;


   public PacketMultiBlockChange() {}

   public PacketMultiBlockChange(int arg_0, short[] arg_1, bff arg_2) {
      this.a = new aqj(arg_2.a, arg_2.b);
      this.b = new jc[arg_0];

      for(int var4 = 0; var4 < this.b.length; ++var4) {
         this.b[var4] = new jc(this, arg_1[var4], arg_2);
      }

   }

   public void read(PacketByteBuf in) {
      this.a = new aqj(in.readInt(), in.readInt());
      this.b = new jc[in.readVarInt()];

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         this.b[var2] = new jc(this, in.readShort(), (bea)Block.blockMap.a(in.readVarInt()));
      }

   }

   public void write(PacketByteBuf out) {
      out.writeInt(this.a.a);
      out.writeInt(this.a.b);
      out.writeVarInt(this.b.length);
      jc[] var2 = this.b;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         jc var5 = var2[var4];
         out.writeShort(var5.b());
         out.writeVarInt(Block.blockMap.get(var5.c()));
      }

   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public jc[] a() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }

   // $FF: synthetic method
   public static aqj a(PacketMultiBlockChange arg_0) {
      return arg_0.a;
   }
}
