
public class PacketServerbound16 extends fq {

   private iq a;


   public PacketServerbound16() {}

   public PacketServerbound16(iq var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = iq.a()[var1.readByte() % iq.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(iq.a(this.a));
   }

   public void a(il var1) {
      var1.a(this);
   }

   public iq c() {
      return this.a;
   }
}
