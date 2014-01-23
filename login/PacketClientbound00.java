
public class PacketClientbound00 extends gf {

   private fv a;


   public PacketClientbound00() {}

   public PacketClientbound00(fv var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = fw.a(var1.readString(32767));
   }

   public void write(PacketBuffer var1) {
      var1.writeString(fw.a(this.a));
   }

   public void a(kh var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
