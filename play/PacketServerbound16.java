
public class PacketServerbound16 extends ft {

   private it a;


   public PacketServerbound16() {}

   public PacketServerbound16(it var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = it.a()[var1.readByte() % it.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(it.a(this.a));
   }

   public void a(io var1) {
      var1.a(this);
   }

   public it c() {
      return this.a;
   }
}
