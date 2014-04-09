
public class PacketServerbound09 extends ft {

   private int a;


   public void read(PacketBuffer var1) {
      this.a = var1.readShort();
   }

   public void write(PacketBuffer var1) {
      var1.writeShort(this.a);
   }

   public void a(io var1) {
      var1.a(this);
   }

   public int c() {
      return this.a;
   }
}
