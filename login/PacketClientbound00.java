
public class PacketClientbound00 implements ha {

   private gn a;


   public PacketClientbound00() {}

   public PacketClientbound00(gn var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.d();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
   }

   public void a(lq var1) {
      var1.a(this);
   }
}
