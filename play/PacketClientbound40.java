
public class PacketClientbound40 extends gs {

   private gh a;


   public PacketClientbound40() {}

   public PacketClientbound40(gh var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.b();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
   }

   public void a(gv var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
