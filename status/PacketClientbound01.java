
public class PacketClientbound01 implements hb {

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

   public void a(ly var1) {
      var1.a(this);
   }
}
