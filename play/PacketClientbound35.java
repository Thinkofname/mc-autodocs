
public class PacketClientbound35 extends ft {

   private int a;
   private int b;
   private int c;
   private int d;
   private dh e;


   public PacketClientbound35() {}

   public PacketClientbound35(int var1, int var2, int var3, int var4, dh var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readShort();
      this.c = var1.readInt();
      this.d = var1.readUnsignedByte();
      this.e = var1.b();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
      var1.writeInt(this.c);
      var1.writeByte((byte)this.d);
      var1.a(this.e);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
