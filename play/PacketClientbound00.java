
public class PacketClientbound00 extends gx {

   private int a;


   public PacketClientbound00() {}

   public PacketClientbound00(int var1) {
      this.a = var1;
   }

   public void a(ha var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
   }

   public boolean a() {
      return true;
   }
}
