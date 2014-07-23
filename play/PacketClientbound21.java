
public class PacketClientbound21 implements ib {

   private int a;
   private int b;
   private jo c;
   private boolean d;


   public PacketClientbound21() {}

   public PacketClientbound21(bdy var1, boolean var2, int var3) {
      this.a = var1.a;
      this.b = var1.b;
      this.d = var2;
      this.c = a(var1, var2, !var1.p().t.p(), var3);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.d = var1.readBoolean();
      this.c = new jo();
      this.c.b = var1.readShort();
      this.c.a = var1.a();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeBoolean(this.d);
      var1.writeShort((short)(this.c.b & '\uffff'));
      var1.a(this.c.a);
   }

   public void a(ii var1) {
      var1.a(this);
   }

   protected static int a(int var0, boolean var1, boolean var2) {
      int var3 = var0 * 8192;
      int var4 = var0 * 4096 / 2;
      int var5 = var1?var0 * 4096 / 2:0;
      int var6 = var2?256:0;
      return var3 + var4 + var5 + var6;
   }

   public static jo a(bdy var0, boolean var1, boolean var2, int var3) {
      bec[] var4 = var0.h();
      jo var5 = new jo();

      int var6;
      for(var6 = 0; var6 < var4.length; ++var6) {
         if(var4[var6] != null && (!var1 || !var4[var6].a()) && (var3 & 1 << var6) != 0) {
            var5.b |= 1 << var6;
         }
      }

      var5.a = new byte[a(Integer.bitCount(var5.b), var2, var1)];
      var6 = 0;

      int var7;
      for(var7 = 0; var7 < var4.length; ++var7) {
         if(var4[var7] != null && (!var1 || !var4[var7].a()) && (var3 & 1 << var7) != 0) {
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

      bdw var13;
      for(var7 = 0; var7 < var4.length; ++var7) {
         if(var4[var7] != null && (!var1 || !var4[var7].a()) && (var3 & 1 << var7) != 0) {
            var13 = var4[var7].h();
            System.arraycopy(var13.b(), 0, var5.a, var6, var13.b().length);
            var6 += var13.b().length;
         }
      }

      if(var2) {
         for(var7 = 0; var7 < var4.length; ++var7) {
            if(var4[var7] != null && (!var1 || !var4[var7].a()) && (var3 & 1 << var7) != 0) {
               var13 = var4[var7].i();
               System.arraycopy(var13.b(), 0, var5.a, var6, var13.b().length);
               var6 += var13.b().length;
            }
         }
      }

      if(var1) {
         byte[] var14 = var0.k();
         System.arraycopy(var14, 0, var5.a, var6, var14.length);
         int var10000 = var6 + var14.length;
      }

      return var5;
   }
}
