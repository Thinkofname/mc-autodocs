
public class PacketServerbound01 extends fq {

   private long a;


   public void read(PacketBuffer var1) {
      this.a = var1.readLong();
   }

   public void write(PacketBuffer var1) {
      var1.writeLong(this.a);
   }

   public void a(ke var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

   public long c() {
      return this.a;
   }
}
