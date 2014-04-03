
public class PacketClientbound05 extends fr {

   private int a;
   private int b;
   private int c;


   public PacketClientbound05() {}

   public PacketClientbound05(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
   }

   public void a(ft var1) {
      var1.a(this);
   }

   public boolean a() {
      return false;
   }

   public String b() {
      return String.format("x=%d, y=%d, z=%d", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
   }
}
