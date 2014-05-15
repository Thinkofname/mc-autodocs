
public class PacketServerbound16 extends gx {

   private kh a;


   public PacketServerbound16() {}

   public PacketServerbound16(kh var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = kh.a()[var1.readUnsignedByte() % kh.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(kh.a(this.a));
   }

   public void a(kd var1) {
      var1.a(this);
   }

   public kh c() {
      return this.a;
   }
}
