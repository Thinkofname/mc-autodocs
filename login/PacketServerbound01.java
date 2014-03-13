import io.netty.buffer.ByteBuf;
import java.security.PrivateKey;
import javax.crypto.SecretKey;

public class PacketServerbound01 extends gt {

   private byte[] a = new byte[0];
   private byte[] b = new byte[0];


   public void read(PacketBuffer var1) {
      this.a = a((ByteBuf)var1);
      this.b = a((ByteBuf)var1);
   }

   public void write(PacketBuffer var1) {
      a(var1, this.a);
      a(var1, this.b);
   }

   public void a(la var1) {
      var1.a(this);
   }

   public SecretKey a(PrivateKey var1) {
      return qy.a(var1, this.a);
   }

   public byte[] b(PrivateKey var1) {
      return var1 == null?this.b:qy.b(var1, this.b);
   }
}
