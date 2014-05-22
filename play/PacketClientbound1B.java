
public class PacketClientbound1B implements gx {

   private int a;
   private int b;
   private int c;


   public PacketClientbound1B() {}

   public PacketClientbound1B(int var1, ub var2, ub var3) {
      this.a = var1;
      this.b = var2.D();
      this.c = var3 != null?var3.D():-1;
   }

   public void read(PacketBuffer var1) {
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.a = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeByte(this.a);
   }

   public void a(hc var1) {
      var1.a(this);
   }
}
