
public class PacketClientbound03 extends gk {

   private long a;
   private long b;


   public PacketClientbound03() {}

   public PacketClientbound03(long var1, long var3, boolean var5) {
      this.a = var1;
      this.b = var3;
      if(!var5) {
         this.b = -this.b;
         if(this.b == 0L) {
            this.b = -1L;
         }
      }

   }

   public void read(PacketBuffer var1) {
      this.a = var1.readLong();
      this.b = var1.readLong();
   }

   public void write(PacketBuffer var1) {
      var1.writeLong(this.a);
      var1.writeLong(this.b);
   }

   public void a(gn var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("time=%d,dtime=%d", new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
   }
}
