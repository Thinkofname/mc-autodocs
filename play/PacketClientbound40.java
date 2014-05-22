
public class PacketClientbound40 implements gx {

   private gl a;


   public PacketClientbound40() {}

   public PacketClientbound40(gl var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.d();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
   }

   public void a(hc var1) {
      var1.a(this);
   }
}
