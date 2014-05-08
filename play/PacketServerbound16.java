
public class PacketServerbound16 extends gv {

   private kd a;


   public PacketServerbound16() {}

   public PacketServerbound16(kd var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = kd.a()[var1.readUnsignedByte() % kd.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(kd.a(this.a));
   }

   public void a(jz var1) {
      var1.a(this);
   }

   public kd c() {
      return this.a;
   }
}
