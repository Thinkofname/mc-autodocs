
public class PacketClientbound00 implements hf {

   private gs a;


   public PacketClientbound00() {}

   public PacketClientbound00(gs var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.d();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
   }

   public void a(lw var1) {
      var1.a(this);
   }
}
