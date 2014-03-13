
public class PacketClientbound02 extends gt {

   private gi a;
   private byte b;


   public PacketClientbound02() {}

   public PacketClientbound02(gi var1) {
      this(var1, (byte)1);
   }

   public PacketClientbound02(gi var1, byte var2) {
      this.a = var1;
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.b();
      this.b = var1.readByte();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
      var1.writeByte(this.b);
   }

   public void a(gw var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("message=\'%s\'", new Object[]{this.a});
   }

   public boolean d() {
      return this.b == 1 || this.b == 2;
   }
}
