
public class PacketClientbound47 implements ib {

   private hm a;
   private hm b;


   public PacketClientbound47() {}

   public PacketClientbound47(hm var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.d();
      this.b = var1.d();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
      var1.a(this.b);
   }

   public void a(ii var1) {
      var1.a(this);
   }
}
