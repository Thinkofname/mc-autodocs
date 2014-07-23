
public class PacketClientbound09 implements ib {

   private int a;


   public PacketClientbound09() {}

   public PacketClientbound09(int var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a);
   }

   public void a(ii var1) {
      var1.a(this);
   }
}
