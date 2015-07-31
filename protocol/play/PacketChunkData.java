package net.minecraft.network.play;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketChunkData implements Packet {

   private int a;
   private int b;
   private go$a c;
   private boolean d;


   public PacketChunkData() {}

   public PacketChunkData(aol arg_0, boolean arg_1, int arg_2) {
      this.a = arg_0.a;
      this.b = arg_0.b;
      this.d = arg_1;
      this.c = a(arg_0, arg_1, !arg_0.p().t.m(), arg_2);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readInt();
      this.b = in.readInt();
      this.d = in.readBoolean();
      this.c = new go$a();
      this.c.b = in.readShort();
      this.c.a = in.readByteArray();
   }

   public void write(PacketByteBuf out) throws IOException {
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
      int var3 = arg_0 * 2 * 16 * 16 * 16;
      int var4 = arg_0 * 16 * 16 * 16 / 2;
      int var5 = arg_1?arg_0 * 16 * 16 * 16 / 2:0;
      int var6 = arg_2?256:0;
      return var3 + var4 + var5 + var6;
   }

   public static go$a a(aol arg_0, boolean arg_1, boolean arg_2, int arg_3) {
      aom[] var4 = arg_0.h();
      go$a var5 = new go$a();
      ArrayList var6 = Lists.newArrayList();

      int var7;
      for(var7 = 0; var7 < var4.length; ++var7) {
         aom var8 = var4[var7];
         if(var8 != null && (!arg_1 || !var8.a()) && (arg_3 & 1 << var7) != 0) {
            var5.b |= 1 << var7;
            var6.add(var8);
         }
      }

      var5.a = new byte[a(Integer.bitCount(var5.b), arg_2, arg_1)];
      var7 = 0;
      Iterator var15 = var6.iterator();

      aom var9;
      while(var15.hasNext()) {
         var9 = (aom)var15.next();
         char[] var10 = var9.g();
         char[] var11 = var10;
         int var12 = var10.length;

         for(int var13 = 0; var13 < var12; ++var13) {
            char var14 = var11[var13];
            var5.a[var7++] = (byte)(var14 & 255);
            var5.a[var7++] = (byte)(var14 >> 8 & 255);
         }
      }

      for(var15 = var6.iterator(); var15.hasNext(); var7 = a(var9.h().a(), var5.a, var7)) {
         var9 = (aom)var15.next();
      }

      if(arg_2) {
         for(var15 = var6.iterator(); var15.hasNext(); var7 = a(var9.i().a(), var5.a, var7)) {
            var9 = (aom)var15.next();
         }
      }

      if(arg_1) {
         a(arg_0.k(), var5.a, var7);
      }

      return var5;
   }

   private static int a(byte[] arg_0, byte[] arg_1, int arg_2) {
      System.arraycopy(arg_0, 0, arg_1, arg_2, arg_0.length);
      return arg_2 + arg_0.length;
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
