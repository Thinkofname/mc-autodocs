
public class PacketServerbound01 implements hf {

   private long a;


   public void read(PacketBuffer var1) {
      this.a = var1.readLong();
   }

   public void write(PacketBuffer var1) {
      var1.writeLong(this.a);
   }

   public void a(mm var1) {
      var1.a(this);
   }

   public long a() {
      return this.a;
   }
}
