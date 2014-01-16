
public class PacketClientbound05 extends ga {

   private cu a;


   public PacketClientbound05() {}

   public PacketClientbound05(cu var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
   }

   public void a(gd var1) {
      var1.a(this);
   }

   public boolean a() {
      return false;
   }

   public String b() {
      return String.format("pos=" + this.a, new Object[0]);
   }
}
