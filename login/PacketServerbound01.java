import java.security.PrivateKey;
import javax.crypto.SecretKey;

public class PacketServerbound01 implements ib {

   private byte[] a = new byte[0];
   private byte[] b = new byte[0];


   public void read(PacketBuffer var1) {
      this.a = var1.a();
      this.b = var1.a();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
      var1.a(this.b);
   }

   public void a(nb var1) {
      var1.a(this);
   }

   public SecretKey a(PrivateKey var1) {
      return tt.a(var1, this.a);
   }

   public byte[] b(PrivateKey var1) {
      return var1 == null?this.b:tt.b(var1, this.b);
   }
}
