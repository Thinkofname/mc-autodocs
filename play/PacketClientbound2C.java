
public class PacketClientbound2C implements gx {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;


   public PacketClientbound2C() {}

   public PacketClientbound2C(ub var1) {
      this.a = var1.D();
      this.b = sd.c(var1.s * 32.0D);
      this.c = sd.c(var1.t * 32.0D);
      this.d = sd.c(var1.u * 32.0D);
      if(var1 instanceof zp) {
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

   public void a(hc var1) {
      var1.a(this);
   }
}
