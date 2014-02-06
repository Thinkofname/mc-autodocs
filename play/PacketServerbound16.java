
public class PacketServerbound16 extends gk {

   private jm a;


   public PacketServerbound16() {}

   public PacketServerbound16(jm var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = jm.a()[var1.readUnsignedByte() % jm.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(jm.a(this.a));
   }

   public void a(ji var1) {
      var1.a(this);
   }

   public jm c() {
      return this.a;
   }
}
