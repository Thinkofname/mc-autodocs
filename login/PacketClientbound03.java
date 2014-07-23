
public class PacketClientbound03 implements ib {

   private int a;


   public PacketClientbound03() {}

   public PacketClientbound03(int var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
   }

   public void a(mw var1) {
      var1.a(this);
   }
}
