
public class PacketServerbound16 implements hz {

   private lp a;


   public PacketServerbound16() {}

   public PacketServerbound16(lp var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = (lp)var1.readEnum(lp.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.a);
   }

   public void a(ll var1) {
      var1.a(this);
   }

   public lp a() {
      return this.a;
   }
}
