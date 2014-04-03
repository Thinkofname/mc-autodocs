
public class PacketClientbound00 extends fr {

   private fh a;


   public PacketClientbound00() {}

   public PacketClientbound00(fh var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = fi.a(var1.readString(32767));
   }

   public void write(PacketBuffer var1) {
      var1.writeString(fi.a(this.a));
   }

   public void a(jp var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
