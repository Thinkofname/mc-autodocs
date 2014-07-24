
public class PacketClientbound23 implements ib {

   private Position a;
   private bcy b;


   public PacketClientbound23() {}

   public PacketClientbound23(aqa var1, Position var2) {
      this.a = var2;
      this.b = var1.p(var2);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = (bcy)asv.d.a(var1.readVarInt());
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
      var1.writeVarInt(asv.d.b(this.b));
   }

   public void a(ii var1) {
      var1.a(this);
   }
}
