
public class PacketServerbound0D implements hb {

   private int a;


   public void a(km var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a);
   }
}
