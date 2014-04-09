
public class PacketClientbound11 extends ft {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;


   public PacketClientbound11() {}

   public PacketClientbound11(sp var1) {
      this.a = var1.x();
      this.b = qg.c(var1.s * 32.0D);
      this.c = qg.c(var1.t * 32.0D);
      this.d = qg.c(var1.u * 32.0D);
      this.e = var1.e();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readShort();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeShort(this.e);
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, value=%d, x=%.2f, y=%.2f, z=%.2f", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.e), Float.valueOf((float)this.b / 32.0F), Float.valueOf((float)this.c / 32.0F), Float.valueOf((float)this.d / 32.0F)});
   }
}
