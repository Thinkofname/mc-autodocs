
public class PacketServerbound09 implements hb {

   private int a;


   public void read(PacketBuffer var1) {
      this.a = var1.readShort();
   }

   public void write(PacketBuffer var1) {
      var1.writeShort(this.a);
   }

   public void a(km var1) {
      var1.a(this);
   }

   public int a() {
      return this.a;
   }
}
