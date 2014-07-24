
public class PacketClientbound2C implements ib {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;


   public PacketClientbound2C() {}

   public PacketClientbound2C(wk var1) {
      this.a = var1.E();
      this.b = uk.c(var1.s * 32.0D);
      this.c = uk.c(var1.t * 32.0D);
      this.d = uk.c(var1.u * 32.0D);
      if(var1 instanceof add) {
         this.e = 1;
      }

   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.e = var1.readByte();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(this.e);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
   }

   public void a(ii var1) {
      var1.a(this);
   }
}
