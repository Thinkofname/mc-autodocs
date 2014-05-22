
public class PacketServerbound16 implements gx {

   private kk a;


   public PacketServerbound16() {}

   public PacketServerbound16(kk var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = (kk)var1.a(kk.class);
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
   }

   public void a(kg var1) {
      var1.a(this);
   }

   public kk a() {
      return this.a;
   }
}
