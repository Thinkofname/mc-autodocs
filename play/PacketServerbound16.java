
public class PacketServerbound16 extends fr {

   private ir a;


   public PacketServerbound16() {}

   public PacketServerbound16(ir var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = ir.a()[var1.readByte() % ir.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(ir.a(this.a));
   }

   public void a(im var1) {
      var1.a(this);
   }

   public ir c() {
      return this.a;
   }
}
