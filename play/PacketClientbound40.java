
public class PacketClientbound40 extends gv {

   private gk a;


   public PacketClientbound40() {}

   public PacketClientbound40(gk var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.b();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
   }

   public void a(gy var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
