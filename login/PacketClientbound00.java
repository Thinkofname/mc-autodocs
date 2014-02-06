
public class PacketClientbound00 extends gm {

   private gc a;


   public PacketClientbound00() {}

   public PacketClientbound00(gc var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = gd.a(var1.readString(32767));
   }

   public void write(PacketBuffer var1) {
      var1.writeString(gd.a(this.a));
   }

   public void a(kp var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
