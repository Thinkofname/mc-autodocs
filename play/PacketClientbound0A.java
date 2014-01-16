
public class PacketClientbound0A extends ga {

   private int a;
   private Position b;


   public PacketClientbound0A() {}

   public PacketClientbound0A(yv var1, Position var2) {
      this.a = var1.x();
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readPosition();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writePosition(this.b);
   }

   public void a(gd var1) {
      var1.a(this);
   }
}
