import io.netty.buffer.ByteBuf;
import java.security.PublicKey;

public class PacketClientbound01 extends gs {

   private String a;
   private PublicKey b;
   private byte[] c;


   public PacketClientbound01() {}

   public PacketClientbound01(String var1, PublicKey var2, byte[] var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(20);
      this.b = qw.a(a((ByteBuf)var1));
      this.c = a((ByteBuf)var1);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      a(var1, this.b.getEncoded());
      a(var1, this.c);
   }

   public void a(kv var1) {
      var1.a(this);
   }
}
