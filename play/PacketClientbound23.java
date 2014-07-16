
public class PacketClientbound23 implements hz {

   private Position a;
   private bcg b;


   public PacketClientbound23() {}

   public PacketClientbound23(apo var1, Position var2) {
      this.a = var2;
      this.b = var1.o(var2);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = (bcg)asf.d.a(var1.readVarInt());
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
      var1.writeVarInt(asf.d.b(this.b));
   }

   public void a(ig var1) {
      var1.a(this);
   }
}
