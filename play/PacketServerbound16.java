
public class PacketServerbound16 implements hb {

   private kq a;


   public PacketServerbound16() {}

   public PacketServerbound16(kq var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = (kq)var1.readEnum(kq.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.a);
   }

   public void a(km var1) {
      var1.a(this);
   }

   public kq a() {
      return this.a;
   }
}
