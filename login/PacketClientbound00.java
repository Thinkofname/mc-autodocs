
public class PacketClientbound00 extends gu {

   private gj a;


   public PacketClientbound00() {}

   public PacketClientbound00(gj var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.b();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
   }

   public void a(la var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
