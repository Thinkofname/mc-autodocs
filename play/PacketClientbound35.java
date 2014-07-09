
public class PacketClientbound35 implements hz {

   private Position a;
   private int b;
   private fj c;


   public PacketClientbound35() {}

   public PacketClientbound35(Position var1, int var2, fj var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = var1.readUnsignedByte();
      this.c = var1.g();
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
      var1.writeByte((byte)this.b);
      var1.a(this.c);
   }

   public void a(ig var1) {
      var1.a(this);
   }
}
