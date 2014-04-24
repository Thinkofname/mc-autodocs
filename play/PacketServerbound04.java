
public class PacketServerbound04 extends kj {

   public PacketServerbound04() {
      this.g = true;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readDouble();
      this.b = var1.readDouble();
      this.c = var1.readDouble();
      super.a(var1);
   }

   public void write(PacketBuffer var1) {
      var1.writeDouble(this.a);
      var1.writeDouble(this.b);
      var1.writeDouble(this.c);
      super.b(var1);
   }
}
