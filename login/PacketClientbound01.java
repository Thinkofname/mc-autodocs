import java.security.PublicKey;

public class PacketClientbound01 implements hf {

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
      this.b = sc.a(var1.a());
      this.c = var1.a();
   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.a(this.b.getEncoded());
      var1.a(this.c);
   }

   public void a(lw var1) {
      var1.a(this);
   }
}
