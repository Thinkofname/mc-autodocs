
public class PacketServerbound16 extends gm {

   private jo a;


   public PacketServerbound16() {}

   public PacketServerbound16(jo var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = jo.a()[var1.readUnsignedByte() % jo.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(jo.a(this.a));
   }

   public void a(jk var1) {
      var1.a(this);
   }

   public jo c() {
      return this.a;
   }
}
