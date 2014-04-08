
public class PacketClientbound0A extends fr {

   private int a;
   private int b;
   private int c;
   private int d;


   public PacketClientbound0A() {}

   public PacketClientbound0A(yw var1, int var2, int var3, int var4) {
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.a = var1.x();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readByte();
      this.d = var1.readInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeByte(this.c);
      var1.writeInt(this.d);
   }

   public void a(ft var1) {
      var1.a(this);
   }
}
