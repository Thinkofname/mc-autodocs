
public class PacketServerbound03 extends fr {

   protected double a;
   protected double b;
   protected double c;
   protected double d;
   protected float e;
   protected float f;
   protected boolean g;
   protected boolean h;
   protected boolean i;


   public void a(im var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.g = var1.readUnsignedByte() != 0;
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.g?1:0);
   }

   public double c() {
      return this.a;
   }

   public double d() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public double f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }

   public boolean i() {
      return this.g;
   }

   public boolean j() {
      return this.h;
   }

   public boolean k() {
      return this.i;
   }

   public void a(boolean var1) {
      this.h = var1;
   }
}
