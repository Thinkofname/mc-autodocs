
public class PacketClientbound11 implements hz {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;


   public PacketClientbound11() {}

   public PacketClientbound11(wv var1) {
      this.a = var1.E();
      this.b = ug.c(var1.s * 32.0D);
      this.c = ug.c(var1.t * 32.0D);
      this.d = ug.c(var1.u * 32.0D);
      this.e = var1.i();
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

   public void a(ig var1) {
      var1.a(this);
   }
}
