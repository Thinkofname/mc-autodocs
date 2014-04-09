
public class PacketServerbound0C extends ft {

   private float a;
   private float b;
   private boolean c;
   private boolean d;


   public void read(PacketBuffer var1) {
      this.a = var1.readFloat();
      this.b = var1.readFloat();
      this.c = var1.readBoolean();
      this.d = var1.readBoolean();
   }

   public void write(PacketBuffer var1) {
      var1.writeFloat(this.a);
      var1.writeFloat(this.b);
      var1.writeBoolean(this.c);
      var1.writeBoolean(this.d);
   }

   public void a(io var1) {
      var1.a(this);
   }

   public float c() {
      return this.a;
   }

   public float d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
