
public class PacketServerbound16 extends gf {

   private jg a;


   public PacketServerbound16() {}

   public PacketServerbound16(jg var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = jg.a()[var1.readUnsignedByte() % jg.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(jg.a(this.a));
   }

   public void a(jc var1) {
      var1.a(this);
   }

   public jg c() {
      return this.a;
   }
}
