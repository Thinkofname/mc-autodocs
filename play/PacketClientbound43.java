
public class PacketClientbound43 implements gx {

   public int a;


   public PacketClientbound43() {}

   public PacketClientbound43(ub var1) {
      this.a = var1.D();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
   }

   public void a(hc var1) {
      var1.a(this);
   }
}
