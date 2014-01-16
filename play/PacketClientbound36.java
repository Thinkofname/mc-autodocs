
public class PacketClientbound36 extends ga {

   private cu a;


   public PacketClientbound36() {}

   public PacketClientbound36(cu var1) {
      this.a = var1;
   }

   public void a(gd var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
   }
}
