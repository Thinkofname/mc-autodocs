
public class PacketServerbound02 extends fq {

   private int a;
   private iy b;


   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = iy.a()[var1.readByte() % iy.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(iy.a(this.b));
   }

   public void a(il var1) {
      var1.a(this);
   }

   public qx a(afy var1) {
      return var1.a(this.a);
   }

   public iy c() {
      return this.b;
   }
}
