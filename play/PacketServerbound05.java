
public class PacketServerbound05 extends jd {

   public PacketServerbound05() {
      this.i = true;
   }

   public void read(PacketBuffer var1) {
      this.e = var1.readFloat();
      this.f = var1.readFloat();
      super.a(var1);
   }

   public void write(PacketBuffer var1) {
      var1.writeFloat(this.e);
      var1.writeFloat(this.f);
      super.b(var1);
   }
}
