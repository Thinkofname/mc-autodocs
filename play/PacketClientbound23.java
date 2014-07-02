
public class PacketClientbound23 implements hf {

   private Position a;
   private ayu b;


   public PacketClientbound23() {}

   public PacketClientbound23(amp var1, Position var2) {
      this.a = var2;
      this.b = var1.p(var2);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = (ayu)apa.e.a(var1.readVarInt());
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
      var1.writeVarInt(apa.e.b(this.b));
   }

   public void a(hl var1) {
      var1.a(this);
   }
}
