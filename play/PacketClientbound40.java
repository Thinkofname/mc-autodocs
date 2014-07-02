
public class PacketClientbound40 implements hf {

   private gs a;


   public PacketClientbound40() {}

   public PacketClientbound40(gs var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.d();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
   }

   public void a(hl var1) {
      var1.a(this);
   }
}
