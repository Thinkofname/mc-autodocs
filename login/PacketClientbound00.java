
public class PacketClientbound00 extends gk {

   private ga a;


   public PacketClientbound00() {}

   public PacketClientbound00(ga var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = gb.a(var1.readString(32767));
   }

   public void write(PacketBuffer var1) {
      var1.writeString(gb.a(this.a));
   }

   public void a(kn var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
