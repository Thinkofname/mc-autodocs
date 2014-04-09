
public class PacketClientbound0D extends ft {

   private int a;
   private int b;


   public PacketClientbound0D() {}

   public PacketClientbound0D(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
