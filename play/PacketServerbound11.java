
public class PacketServerbound11 implements hz {

   private int a;
   private int b;


   public void a(lm var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readByte();
      this.b = var1.readByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a);
      var1.writeByte(this.b);
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }
}
