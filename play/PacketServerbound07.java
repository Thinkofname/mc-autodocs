
public class PacketServerbound07 extends fr {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;


   public void read(PacketBuffer var1) {
      this.e = var1.readUnsignedByte();
      this.a = var1.readInt();
      this.b = var1.readUnsignedByte();
      this.c = var1.readInt();
      this.d = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.e);
      var1.writeInt(this.a);
      var1.writeByte(this.b);
      var1.writeInt(this.c);
      var1.writeByte(this.d);
   }

   public void a(im var1) {
      var1.a(this);
   }

   public int c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }
}
