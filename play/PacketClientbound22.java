import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PacketClientbound22 implements hb {

   private static final Logger a = LogManager.getLogger();
   private alq b;
   private byte[] c;
   private int d;


   public PacketClientbound22() {}

   public PacketClientbound22(int var1, short[] var2, ayy var3) {
      this.b = new alq(var3.a, var3.b);
      this.d = var1;
      int var4 = 4 * var1;

      try {
         ByteArrayOutputStream var5 = new ByteArrayOutputStream(var4);
         DataOutputStream var6 = new DataOutputStream(var5);

         for(int var7 = 0; var7 < var1; ++var7) {
            int var8 = var2[var7] >> 12 & 15;
            int var9 = var2[var7] >> 8 & 15;
            int var10 = var2[var7] & 255;
            var6.writeShort(var2[var7]);
            var6.writeShort((short)((aoi.a(var3.a(var8, var10, var9)) & 4095) << 4 | var3.b(var8, var10, var9) & 15));
         }

         this.c = var5.toByteArray();
         if(this.c.length != var4) {
            throw new RuntimeException("Expected length " + var4 + " doesn\'t match received length " + this.c.length);
         }
      } catch (IOException var11) {
         a.error("Couldn\'t create bulk block update packet", var11);
         this.c = null;
      }

   }

   public void read(PacketBuffer var1) {
      this.b = new alq(var1.readInt(), var1.readInt());
      this.d = var1.readShort() & '\uffff';
      int var2 = var1.readInt();
      if(var2 > 0) {
         this.c = new byte[var2];
         var1.readBytes(this.c);
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.b.a);
      var1.writeInt(this.b.b);
      var1.writeShort((short)this.d);
      if(this.c != null) {
         var1.writeInt(this.c.length);
         var1.writeBytes(this.c);
      } else {
         var1.writeInt(0);
      }

   }

   public void a(hh var1) {
      var1.a(this);
   }

}
