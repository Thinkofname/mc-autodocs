package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.block.Block;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketMultiBlockChange implements Packet {

   private aei a;
   private ga$a[] b;


   public PacketMultiBlockChange() {}

   public PacketMultiBlockChange(int arg_0, short[] arg_1, aol arg_2) {
      this.a = new aei(arg_2.a, arg_2.b);
      this.b = new ga$a[arg_0];

      for(int var4 = 0; var4 < this.b.length; ++var4) {
         this.b[var4] = new ga$a(this, arg_1[var4], arg_2);
      }

   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = new aei(in.readInt(), in.readInt());
      this.b = new ga$a[in.readVarInt()];

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         this.b[var2] = new ga$a(this, in.readShort(), (anm)Block.blockMap.a(in.readVarInt()));
      }

   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeInt(this.a.a);
      out.writeInt(this.a.b);
      out.writeVarInt(this.b.length);
      ga$a[] var2 = this.b;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         ga$a var5 = var2[var4];
         out.writeShort(var5.b());
         out.writeVarInt(Block.blockMap.get(var5.c()));
      }

   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public ga$a[] a() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }

   // $FF: synthetic method
   public static aei a(PacketMultiBlockChange arg_0) {
      return arg_0.a;
   }
}
