
public class PacketServerbound16 extends gt {

   private jv a;


   public PacketServerbound16() {}

   public PacketServerbound16(jv var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = jv.a()[var1.readUnsignedByte() % jv.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(jv.a(this.a));
   }

   public void a(jr var1) {
      var1.a(this);
   }

   public jv c() {
      return this.a;
   }
}
