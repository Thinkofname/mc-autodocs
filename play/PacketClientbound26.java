import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class PacketClientbound26 extends gx {

   private int[] a;
   private int[] b;
   private int[] c;
   private int[] d;
   private byte[] e;
   private byte[][] f;
   private int g;
   private boolean h;
   private static byte[] i = new byte[0];


   public PacketClientbound26() {}

   public PacketClientbound26(List var1) {
      int var2 = var1.size();
      this.a = new int[var2];
      this.b = new int[var2];
      this.c = new int[var2];
      this.d = new int[var2];
      this.f = new byte[var2][];
      this.h = !var1.isEmpty() && !((ayg)var1.get(0)).p().s.p();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         ayg var5 = (ayg)var1.get(var4);
         ie var6 = id.a(var5, true, '\uffff');
         if(i.length < var3 + var6.a.length) {
            byte[] var7 = new byte[var3 + var6.a.length];
            System.arraycopy(i, 0, var7, 0, i.length);
            i = var7;
         }

         System.arraycopy(var6.a, 0, i, var3, var6.a.length);
         var3 += var6.a.length;
         this.a[var4] = var5.a;
         this.b[var4] = var5.b;
         this.c[var4] = var6.b;
         this.d[var4] = var6.c;
         this.f[var4] = var6.a;
      }

      Deflater var11 = new Deflater(-1);

      try {
         var11.setInput(i, 0, var3);
         var11.finish();
         this.e = new byte[var3];
         this.g = var11.deflate(this.e);
      } finally {
         var11.end();
      }

   }

   public static int c() {
      return 5;
   }

   public void read(PacketBuffer var1) {
      short var2 = var1.readShort();
      this.g = var1.readInt();
      this.h = var1.readBoolean();
      this.a = new int[var2];
      this.b = new int[var2];
      this.c = new int[var2];
      this.d = new int[var2];
      this.f = new byte[var2][];
      if(i.length < this.g) {
         i = new byte[this.g];
      }

      var1.readBytes(i, 0, this.g);
      byte[] var3 = new byte[id.c() * var2];
      Inflater var4 = new Inflater();
      var4.setInput(i, 0, this.g);

      try {
         var4.inflate(var3);
      } catch (DataFormatException var12) {
         throw new IOException("Bad compressed data format");
      } finally {
         var4.end();
      }

      int var5 = 0;

      for(int var6 = 0; var6 < var2; ++var6) {
         this.a[var6] = var1.readInt();
         this.b[var6] = var1.readInt();
         this.c[var6] = var1.readShort();
         this.d[var6] = var1.readShort();
         int var7 = 0;
         int var8 = 0;

         int var9;
         for(var9 = 0; var9 < 16; ++var9) {
            var7 += this.c[var6] >> var9 & 1;
            var8 += this.d[var6] >> var9 & 1;
         }

         var9 = 2048 * 4 * var7 + 256;
         var9 += 2048 * var8;
         if(this.h) {
            var9 += 2048 * var7;
         }

         this.f[var6] = new byte[var9];
         System.arraycopy(var3, var5, this.f[var6], 0, var9);
         var5 += var9;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeShort(this.a.length);
      var1.writeInt(this.g);
      var1.writeBoolean(this.h);
      var1.writeBytes(this.e, 0, this.g);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         var1.writeInt(this.a[var2]);
         var1.writeInt(this.b[var2]);
         var1.writeShort((short)(this.c[var2] & '\uffff'));
         var1.writeShort((short)(this.d[var2] & '\uffff'));
      }

   }

   public void a(ha var1) {
      var1.a(this);
   }

   public String b() {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if(var2 > 0) {
            var1.append(", ");
         }

         var1.append(String.format("{x=%d, z=%d, sections=%d, adds=%d, data=%d}", new Object[]{Integer.valueOf(this.a[var2]), Integer.valueOf(this.b[var2]), Integer.valueOf(this.c[var2]), Integer.valueOf(this.d[var2]), Integer.valueOf(this.f[var2].length)}));
      }

      return String.format("size=%d, chunks=%d[%s]", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.a.length), var1});
   }

}
