
public class PacketServerbound03 extends gu {

   protected double a;
   protected double b;
   protected double c;
   protected float d;
   protected float e;
   protected boolean f;
   protected boolean g;
   protected boolean h;


   public void a(jv var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.f = var1.readUnsignedByte() != 0;
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.f?1:0);
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

   public float f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public boolean h() {
      return this.f;
   }

   public boolean i() {
      return this.g;
   }

   public boolean j() {
      return this.h;
   }

   public void a(boolean var1) {
      this.g = var1;
   }
}
