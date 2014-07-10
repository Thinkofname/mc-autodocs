
public class PacketClientbound43 implements hz {

   public int a;


   public PacketClientbound43() {}

   public PacketClientbound43(wg var1) {
      this.a = var1.E();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
   }

   public void a(ig var1) {
      var1.a(this);
   }
}
