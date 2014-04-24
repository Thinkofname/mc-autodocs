
public class PacketServerbound05 extends kj {

   public PacketServerbound05() {
      this.h = true;
   }

   public void read(PacketBuffer var1) {
      this.d = var1.readFloat();
      this.e = var1.readFloat();
      super.a(var1);
   }

   public void write(PacketBuffer var1) {
      var1.writeFloat(this.d);
      var1.writeFloat(this.e);
      super.b(var1);
   }
}
