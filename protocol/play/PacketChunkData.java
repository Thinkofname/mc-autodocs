package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketChunkData implements Packet {

   private int a;
   private int b;
   private jq c;
   private boolean d;


   public PacketChunkData() {}

   public PacketChunkData(bfb arg_0, boolean arg_1, int arg_2) {
      this.a = arg_0.a;
      this.b = arg_0.b;
      this.d = arg_1;
      this.c = a(arg_0, arg_1, !arg_0.p().t.p(), arg_2);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readInt();
      this.b = in.readInt();
      this.d = in.readBoolean();
      this.c = new jq();
      this.c.b = in.readShort();
      this.c.a = in.readByteArray();
   }

   public void write(PacketByteBuf out) {
      out.writeInt(this.a);
      out.writeInt(this.b);
      out.writeBoolean(this.d);
      out.writeShort((short)(this.c.b & '\uffff'));
      out.writeByteArray(this.c.a);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public byte[] a() {
      return this.c.a;
   }

   public static int a(int arg_0, boolean arg_1, boolean arg_2) {
      int var3 = arg_0 * 8192;
      int var4 = arg_0 * 4096 / 2;
      int var5 = arg_1?arg_0 * 4096 / 2:0;
      int var6 = arg_2?256:0;
      return var3 + var4 + var5 + var6;
   }

   public static jq a(bfb arg_0, boolean arg_1, boolean arg_2, int arg_3) {
      bfg[] var4 = arg_0.h();
      jq var5 = new jq();

      int var6;
      for(var6 = 0; var6 < var4.length; ++var6) {
         if(var4[var6] != null && (!arg_1 || !var4[var6].a()) && (arg_3 & 1 << var6) != 0) {
            var5.b |= 1 << var6;
         }
      }

      var5.a = new byte[a(Integer.bitCount(var5.b), arg_2, arg_1)];
      var6 = 0;

      int var7;
      for(var7 = 0; var7 < var4.length; ++var7) {
         if(var4[var7] != null && (!arg_1 || !var4[var7].a()) && (arg_3 & 1 << var7) != 0) {
            char[] var8 = var4[var7].g();
            char[] var9 = var8;
            int var10 = var8.length;

            for(int var11 = 0; var11 < var10; ++var11) {
               char var12 = var9[var11];
               var5.a[var6++] = (byte)(var12 & 255);
               var5.a[var6++] = (byte)(var12 >> 8 & 255);
            }
         }
      }

      bez var13;
      for(var7 = 0; var7 < var4.length; ++var7) {
         if(var4[var7] != null && (!arg_1 || !var4[var7].a()) && (arg_3 & 1 << var7) != 0) {
            var13 = var4[var7].h();
            System.arraycopy(var13.b(), 0, var5.a, var6, var13.b().length);
            var6 += var13.b().length;
         }
      }

      if(arg_2) {
         for(var7 = 0; var7 < var4.length; ++var7) {
            if(var4[var7] != null && (!arg_1 || !var4[var7].a()) && (arg_3 & 1 << var7) != 0) {
               var13 = var4[var7].i();
               System.arraycopy(var13.b(), 0, var5.a, var6, var13.b().length);
               var6 += var13.b().length;
            }
         }
      }

      if(arg_1) {
         byte[] var14 = arg_0.k();
         System.arraycopy(var14, 0, var5.a, var6, var14.length);
         int var10000 = var6 + var14.length;
      }

      return var5;
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.c.b;
   }

   public boolean e() {
      return this.d;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
