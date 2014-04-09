
public class PacketServerbound00 extends ft {

   private int a;


   public void a(io var1) {
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

   public int c() {
      return this.a;
   }
}
