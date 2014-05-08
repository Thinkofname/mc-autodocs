
public class PacketClientbound00 extends gv {

   private gk a;


   public PacketClientbound00() {}

   public PacketClientbound00(gk var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.b();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
   }

   public void a(lf var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
