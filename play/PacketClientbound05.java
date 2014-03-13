
public class PacketClientbound05 extends gt {

   private Position a;


   public PacketClientbound05() {}

   public PacketClientbound05(Position var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
   }

   public void a(gw var1) {
      var1.a(this);
   }

   public boolean a() {
      return false;
   }

   public String b() {
      return String.format("pos=" + this.a, new Object[0]);
   }
}
