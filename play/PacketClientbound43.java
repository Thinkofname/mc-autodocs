
public class PacketClientbound43 implements hf {

   public int a;


   public PacketClientbound43() {}

   public PacketClientbound43(um var1) {
      this.a = var1.D();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
   }

   public void a(hl var1) {
      var1.a(this);
   }
}
