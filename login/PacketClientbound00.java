
public class PacketClientbound00 implements gx {

   private gl a;


   public PacketClientbound00() {}

   public PacketClientbound00(gl var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.d();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
   }

   public void a(lm var1) {
      var1.a(this);
   }
}
