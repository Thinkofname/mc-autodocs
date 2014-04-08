import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class PacketClientbound21 extends fr {

   private int a;
   private int b;
   private int c;
   private int d;
   private byte[] e;
   private byte[] f;
   private boolean g;
   private int h;
   private static byte[] i = new byte[196864];


   public PacketClientbound21() {}

   public PacketClientbound21(apu var1, boolean var2, int var3) {
      this.a = var1.g;
      this.b = var1.h;
      this.g = var2;
      gw var4 = a(var1, var2, var3);
      Deflater var5 = new Deflater(-1);
      this.d = var4.c;
      this.c = var4.b;

      try {
         this.f = var4.a;
         var5.setInput(var4.a, 0, var4.a.length);
         var5.finish();
         this.e = new byte[var4.a.length];
         this.h = var5.deflate(this.e);
      } finally {
         var5.end();
      }

   }

   public static int c() {
      return 196864;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.g = var1.readBoolean();
      this.c = var1.readShort();
      this.d = var1.readShort();
      this.h = var1.readInt();
      if(i.length < this.h) {
         i = new byte[this.h];
      }

      var1.readBytes(i, 0, this.h);
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < 16; ++var3) {
         var2 += this.c >> var3 & 1;
      }

      var3 = 12288 * var2;
      if(this.g) {
         var3 += 256;
      }

      this.f = new byte[var3];
      Inflater var4 = new Inflater();
      var4.setInput(i, 0, this.h);

      try {
         var4.inflate(this.f);
      } catch (DataFormatException var9) {
         throw new IOException("Bad compressed data format");
      } finally {
         var4.end();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeBoolean(this.g);
      var1.writeShort((short)(this.c & '\uffff'));
      var1.writeShort((short)(this.d & '\uffff'));
      var1.writeInt(this.h);
      var1.writeBytes(this.e, 0, this.h);
   }

   public void a(ft var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("x=%d, z=%d, full=%b, sects=%d, add=%d, size=%d", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.g), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.h)});
   }

   public static gw a(apu var0, boolean var1, int var2) {
      int var3 = 0;
      apw[] var4 = var0.i();
      int var5 = 0;
      gw var6 = new gw();
      byte[] var7 = i;
      if(var1) {
         var0.q = true;
      }

      int var8;
      for(var8 = 0; var8 < var4.length; ++var8) {
         if(var4[var8] != null && (!var1 || !var4[var8].a()) && (var2 & 1 << var8) != 0) {
            var6.b |= 1 << var8;
            if(var4[var8].i() != null) {
               var6.c |= 1 << var8;
               ++var5;
            }
         }
      }

      for(var8 = 0; var8 < var4.length; ++var8) {
         if(var4[var8] != null && (!var1 || !var4[var8].a()) && (var2 & 1 << var8) != 0) {
            byte[] var9 = var4[var8].g();
            System.arraycopy(var9, 0, var7, var3, var9.length);
            var3 += var9.length;
         }
      }

      aps var10;
      for(var8 = 0; var8 < var4.length; ++var8) {
         if(var4[var8] != null && (!var1 || !var4[var8].a()) && (var2 & 1 << var8) != 0) {
            var10 = var4[var8].j();
            System.arraycopy(var10.a, 0, var7, var3, var10.a.length);
            var3 += var10.a.length;
         }
      }

      for(var8 = 0; var8 < var4.length; ++var8) {
         if(var4[var8] != null && (!var1 || !var4[var8].a()) && (var2 & 1 << var8) != 0) {
            var10 = var4[var8].k();
            System.arraycopy(var10.a, 0, var7, var3, var10.a.length);
            var3 += var10.a.length;
         }
      }

      if(!var0.e.t.g) {
         for(var8 = 0; var8 < var4.length; ++var8) {
            if(var4[var8] != null && (!var1 || !var4[var8].a()) && (var2 & 1 << var8) != 0) {
               var10 = var4[var8].l();
               System.arraycopy(var10.a, 0, var7, var3, var10.a.length);
               var3 += var10.a.length;
            }
         }
      }

      if(var5 > 0) {
         for(var8 = 0; var8 < var4.length; ++var8) {
            if(var4[var8] != null && (!var1 || !var4[var8].a()) && var4[var8].i() != null && (var2 & 1 << var8) != 0) {
               var10 = var4[var8].i();
               System.arraycopy(var10.a, 0, var7, var3, var10.a.length);
               var3 += var10.a.length;
            }
         }
      }

      if(var1) {
         byte[] var11 = var0.m();
         System.arraycopy(var11, 0, var7, var3, var11.length);
         var3 += var11.length;
      }

      var6.a = new byte[var3];
      System.arraycopy(var7, 0, var6.a, 0, var3);
      return var6;
   }

}
