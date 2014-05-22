
public class PacketServerbound06 extends ku {

   public PacketServerbound06() {
      this.g = true;
      this.h = true;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readDouble();
      this.b = var1.readDouble();
      this.c = var1.readDouble();
      this.d = var1.readFloat();
      this.e = var1.readFloat();
      super.a(var1);
   }

   public void write(PacketBuffer var1) {
      var1.writeDouble(this.a);
      var1.writeDouble(this.b);
      var1.writeDouble(this.c);
      var1.writeFloat(this.d);
      var1.writeFloat(this.e);
      super.b(var1);
   }
}
