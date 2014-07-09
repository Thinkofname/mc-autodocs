
public class PacketClientbound21 implements hz {

   private int a;
   private int b;
   private jm c;
   private boolean d;


   public PacketClientbound21() {}

   public PacketClientbound21(bcw var1, boolean var2, int var3) {
      this.a = var1.a;
      this.b = var1.b;
      this.d = var2;
      this.c = a(var1, var2, var3);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.d = var1.readBoolean();
      this.c = new jm();
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

   public void a(ig var1) {
      var1.a(this);
   }

   protected static int a(int var0, boolean var1, boolean var2) {
      int var3 = var0 * 8192;
      int var4 = var0 * 4096 / 2;
      int var5 = var1?var0 * 4096 / 2:0;
      int var6 = var2?256:0;
      return var3 + var4 + var5 + var6;
   }

   public static jm a(bcw var0, boolean var1, int var2) {
      bda[] var3 = var0.h();
      jm var4 = new jm();

      int var5;
      for(var5 = 0; var5 < var3.length; ++var5) {
         if(var3[var5] != null && (!var1 || !var3[var5].a()) && (var2 & 1 << var5) != 0) {
            var4.b |= 1 << var5;
         }
      }

      var4.a = new byte[a(Integer.bitCount(var4.b), true, var1)];
      var5 = 0;

      int var6;
      for(var6 = 0; var6 < var3.length; ++var6) {
         if(var3[var6] != null && (!var1 || !var3[var6].a()) && (var2 & 1 << var6) != 0) {
            char[] var7 = var3[var6].g();
            char[] var8 = var7;
            int var9 = var7.length;

            for(int var10 = 0; var10 < var9; ++var10) {
               char var11 = var8[var10];
               var4.a[var5++] = (byte)(var11 & 255);
               var4.a[var5++] = (byte)(var11 >> 8 & 255);
            }
         }
      }

      bcu var12;
      for(var6 = 0; var6 < var3.length; ++var6) {
         if(var3[var6] != null && (!var1 || !var3[var6].a()) && (var2 & 1 << var6) != 0) {
            var12 = var3[var6].h();
            System.arraycopy(var12.b(), 0, var4.a, var5, var12.b().length);
            var5 += var12.b().length;
         }
      }

      if(!var0.p().s.p()) {
         for(var6 = 0; var6 < var3.length; ++var6) {
            if(var3[var6] != null && (!var1 || !var3[var6].a()) && (var2 & 1 << var6) != 0) {
               var12 = var3[var6].i();
               System.arraycopy(var12.b(), 0, var4.a, var5, var12.b().length);
               var5 += var12.b().length;
            }
         }
      }

      if(var1) {
         byte[] var13 = var0.k();
         System.arraycopy(var13, 0, var4.a, var5, var13.length);
         int var10000 = var5 + var13.length;
      }

      return var4;
   }
}
