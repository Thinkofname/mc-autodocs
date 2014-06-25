import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class PacketClientbound21 implements hb {

   private int a;
   private int b;
   private int c;
   private byte[] d;
   private byte[] e;
   private boolean f;
   private int g;
   private static byte[] h = new byte[196864];


   public PacketClientbound21() {}

   public PacketClientbound21(ayy var1, boolean var2, int var3) {
      this.a = var1.a;
      this.b = var1.b;
      this.f = var2;
      im var4 = a(var1, var2, var3);
      Deflater var5 = new Deflater(-1);
      this.c = var4.b;

      try {
         this.e = var4.a;
         var5.setInput(var4.a, 0, var4.a.length);
         var5.finish();
         this.d = new byte[var4.a.length];
         this.g = var5.deflate(this.d);
      } finally {
         var5.end();
      }

   }

   public static int a() {
      return 196864;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.f = var1.readBoolean();
      this.c = var1.readShort();
      this.g = var1.readInt();
      if(h.length < this.g) {
         h = new byte[this.g];
      }

      var1.readBytes(h, 0, this.g);
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < 16; ++var3) {
         var2 += this.c >> var3 & 1;
      }

      var3 = 12288 * var2;
      if(this.f) {
         var3 += 256;
      }

      this.e = new byte[var3];
      Inflater var4 = new Inflater();
      var4.setInput(h, 0, this.g);

      try {
         var4.inflate(this.e);
      } catch (DataFormatException var9) {
         throw new IOException("Bad compressed data format");
      } finally {
         var4.end();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeBoolean(this.f);
      var1.writeShort((short)(this.c & '\uffff'));
      var1.writeInt(this.g);
      var1.writeBytes(this.d, 0, this.g);
   }

   public void a(hh var1) {
      var1.a(this);
   }

   public static im a(ayy var0, boolean var1, int var2) {
      int var3 = 0;
      azc[] var4 = var0.h();
      im var5 = new im();
      byte[] var6 = h;

      int var7;
      for(var7 = 0; var7 < var4.length; ++var7) {
         if(var4[var7] != null && (!var1 || !var4[var7].a()) && (var2 & 1 << var7) != 0) {
            var5.b |= 1 << var7;
         }
      }

      for(var7 = 0; var7 < var4.length; ++var7) {
         if(var4[var7] != null && (!var1 || !var4[var7].a()) && (var2 & 1 << var7) != 0) {
            char[] var8 = var4[var7].g();
            char[] var9 = var8;
            int var10 = var8.length;

            for(int var11 = 0; var11 < var10; ++var11) {
               char var12 = var9[var11];
               var6[var3++] = (byte)(var12 & 255);
               var6[var3++] = (byte)(var12 >> 8 & 255);
            }
         }
      }

      ayw var13;
      for(var7 = 0; var7 < var4.length; ++var7) {
         if(var4[var7] != null && (!var1 || !var4[var7].a()) && (var2 & 1 << var7) != 0) {
            var13 = var4[var7].h();
            System.arraycopy(var13.b(), 0, var6, var3, var13.b().length);
            var3 += var13.b().length;
         }
      }

      if(!var0.p().s.p()) {
         for(var7 = 0; var7 < var4.length; ++var7) {
            if(var4[var7] != null && (!var1 || !var4[var7].a()) && (var2 & 1 << var7) != 0) {
               var13 = var4[var7].i();
               System.arraycopy(var13.b(), 0, var6, var3, var13.b().length);
               var3 += var13.b().length;
            }
         }
      }

      if(var1) {
         byte[] var14 = var0.k();
         System.arraycopy(var14, 0, var6, var3, var14.length);
         var3 += var14.length;
      }

      var5.a = new byte[var3];
      System.arraycopy(var6, 0, var5.a, 0, var3);
      return var5;
   }

}
