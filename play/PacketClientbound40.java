
public class PacketClientbound40 extends ft {

   private fj a;


   public PacketClientbound40() {}

   public PacketClientbound40(fj var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = fk.a(var1.readString(32767));
   }

   public void write(PacketBuffer var1) {
      var1.writeString(fk.a(this.a));
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
