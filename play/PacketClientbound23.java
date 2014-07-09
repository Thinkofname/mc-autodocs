
public class PacketClientbound23 implements hz {

   private Position a;
   private bbt b;


   public PacketClientbound23() {}

   public PacketClientbound23(apm var1, Position var2) {
      this.a = var2;
      this.b = var1.o(var2);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = (bbt)ary.d.a(var1.readVarInt());
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
      var1.writeVarInt(ary.d.b(this.b));
   }

   public void a(ig var1) {
      var1.a(this);
   }
}
