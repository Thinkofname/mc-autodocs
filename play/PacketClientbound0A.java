
public class PacketClientbound0A implements hf {

   private int a;
   private Position b;


   public PacketClientbound0A() {}

   public PacketClientbound0A(adq var1, Position var2) {
      this.a = var1.D();
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readPosition();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writePosition(this.b);
   }

   public void a(hl var1) {
      var1.a(this);
   }
}
