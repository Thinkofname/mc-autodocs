
public class PacketServerbound04 extends jd {

   public PacketServerbound04() {
      this.h = true;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readDouble();
      this.b = var1.readDouble();
      this.d = var1.readDouble();
      this.c = var1.readDouble();
      super.a(var1);
   }

   public void write(PacketBuffer var1) {
      var1.writeDouble(this.a);
      var1.writeDouble(this.b);
      var1.writeDouble(this.d);
      var1.writeDouble(this.c);
      super.b(var1);
   }
}
