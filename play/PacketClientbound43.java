
public class PacketClientbound43 implements hb {

   public int a;


   public PacketClientbound43() {}

   public PacketClientbound43(ud var1) {
      this.a = var1.D();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
   }

   public void a(hh var1) {
      var1.a(this);
   }
}
