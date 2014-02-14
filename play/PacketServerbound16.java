
public class PacketServerbound16 extends gs {

   private ju a;


   public PacketServerbound16() {}

   public PacketServerbound16(ju var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = ju.a()[var1.readUnsignedByte() % ju.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(ju.a(this.a));
   }

   public void a(jq var1) {
      var1.a(this);
   }

   public ju c() {
      return this.a;
   }
}
