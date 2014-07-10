
public class PacketClientbound47 implements hz {

   private hk a;
   private hk b;


   public PacketClientbound47() {}

   public PacketClientbound47(hk var1) {
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

   public void a(ig var1) {
      var1.a(this);
   }
}
