
public class PacketClientbound23 implements hb {

   private Position a;
   private ayb b;


   public PacketClientbound23() {}

   public PacketClientbound23(aly var1, Position var2) {
      this.a = var2;
      this.b = var1.q(var2);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = (ayb)aoj.e.a(var1.readVarInt());
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
      var1.writeVarInt(aoj.e.b(this.b));
   }

   public void a(hh var1) {
      var1.a(this);
   }
}
