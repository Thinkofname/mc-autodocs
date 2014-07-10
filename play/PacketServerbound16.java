
public class PacketServerbound16 implements hz {

   private lq a;


   public PacketServerbound16() {}

   public PacketServerbound16(lq var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = (lq)var1.readEnum(lq.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.a);
   }

   public void a(lm var1) {
      var1.a(this);
   }

   public lq a() {
      return this.a;
   }
}
