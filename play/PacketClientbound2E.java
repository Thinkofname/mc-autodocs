
public class PacketClientbound2E implements ha {

   private int a;


   public PacketClientbound2E() {}

   public PacketClientbound2E(int var1) {
      this.a = var1;
   }

   public void a(hg var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a);
   }
}
