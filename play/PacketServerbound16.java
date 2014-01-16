
public class PacketServerbound16 extends ga {

   private jc a;


   public PacketServerbound16() {}

   public PacketServerbound16(jc var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = jc.a()[var1.readByte() % jc.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(jc.a(this.a));
   }

   public void a(ix var1) {
      var1.a(this);
   }

   public jc c() {
      return this.a;
   }
}
