import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class PacketClientbound26 implements hb {

   private int[] a;
   private int[] b;
   private int[] c;
   private byte[] d;
   private byte[][] e;
   private int f;
   private boolean g;
   private static byte[] h = new byte[0];


   public PacketClientbound26() {}

   public PacketClientbound26(List var1) {
      int var2 = var1.size();
      this.a = new int[var2];
      this.b = new int[var2];
      this.c = new int[var2];
      this.e = new byte[var2][];
      this.g = !var1.isEmpty() && !((ayz)var1.get(0)).p().s.p();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         ayz var5 = (ayz)var1.get(var4);
         in var6 = im.a(var5, true, '\uffff');
         if(h.length < var3 + var6.a.length) {
            byte[] var7 = new byte[var3 + var6.a.length];
            System.arraycopy(h, 0, var7, 0, h.length);
            h = var7;
         }

         System.arraycopy(var6.a, 0, h, var3, var6.a.length);
         var3 += var6.a.length;
         this.a[var4] = var5.a;
         this.b[var4] = var5.b;
         this.c[var4] = var6.b;
         this.e[var4] = var6.a;
      }

      Deflater var11 = new Deflater(-1);

      try {
         var11.setInput(h, 0, var3);
         var11.finish();
         this.d = new byte[var3];
         this.f = var11.deflate(this.d);
      } finally {
         var11.end();
      }

   }

   public static int a() {
      return 5;
   }

   public void read(PacketBuffer var1) {
      short var2 = var1.readShort();
      this.f = var1.readInt();
      this.g = var1.readBoolean();
      this.a = new int[var2];
      this.b = new int[var2];
      this.c = new int[var2];
      this.e = new byte[var2][];
      if(h.length < this.f) {
         h = new byte[this.f];
      }

      var1.readBytes(h, 0, this.f);
      byte[] var3 = new byte[im.a() * var2];
      Inflater var4 = new Inflater();
      var4.setInput(h, 0, this.f);

      try {
         var4.inflate(var3);
      } catch (DataFormatException var15) {
         throw new IOException("Bad compressed data format");
      } finally {
         var4.end();
      }

      int var5 = 0;

      for(int var6 = 0; var6 < var2; ++var6) {
         this.a[var6] = var1.readInt();
         this.b[var6] = var1.readInt();
         this.c[var6] = var1.readShort();
         int var7 = 0;

         int var8;
         for(var8 = 0; var8 < 16; ++var8) {
            var7 += this.c[var6] >> var8 & 1;
         }

         var8 = var7 * 8192;
         int var9 = var7 * 4096 / 2;
         int var10 = this.g?var7 * 4096 / 2:0;
         short var11 = 256;
         int var12 = var8 + var9 + var10 + var11;
         this.e[var6] = new byte[var12];
         System.arraycopy(var3, var5, this.e[var6], 0, var12);
         var5 += var12;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeShort(this.a.length);
      var1.writeInt(this.f);
      var1.writeBoolean(this.g);
      var1.writeBytes(this.d, 0, this.f);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         var1.writeInt(this.a[var2]);
         var1.writeInt(this.b[var2]);
         var1.writeShort((short)(this.c[var2] & '\uffff'));
      }

   }

   public void a(hh var1) {
      var1.a(this);
   }

}
