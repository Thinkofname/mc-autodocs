
public class PacketClientbound01 extends gt {

   private long a;


   public PacketClientbound01() {}

   public PacketClientbound01(long var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readLong();
   }

   public void write(PacketBuffer var1) {
      var1.writeLong(this.a);
   }

   public void a(ld var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
