
public class PacketClientbound00 implements hb {

   private go a;


   public PacketClientbound00() {}

   public PacketClientbound00(go var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.d();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
   }

   public void a(ls var1) {
      var1.a(this);
   }
}
