
public class PacketClientbound40 implements ha {

   private gn a;


   public PacketClientbound40() {}

   public PacketClientbound40(gn var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.d();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
   }

   public void a(hg var1) {
      var1.a(this);
   }
}
