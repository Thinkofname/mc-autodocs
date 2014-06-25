
public class PacketServerbound16 implements hb {

   private kp a;


   public PacketServerbound16() {}

   public PacketServerbound16(kp var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = (kp)var1.readEnum(kp.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.a);
   }

   public void a(kl var1) {
      var1.a(this);
   }

   public kp a() {
      return this.a;
   }
}
