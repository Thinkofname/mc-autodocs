
public class PacketClientbound35 extends gm {

   private Position a;
   private int b;
   private eh c;


   public PacketClientbound35() {}

   public PacketClientbound35(Position var1, int var2, eh var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = var1.readUnsignedByte();
      this.c = var1.d();
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
      var1.writeByte((byte)this.b);
      var1.a(this.c);
   }

   public void a(gp var1) {
      var1.a(this);
   }
}
