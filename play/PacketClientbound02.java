
public class PacketClientbound02 extends gk {

   private ga a;
   private byte b;


   public PacketClientbound02() {}

   public PacketClientbound02(ga var1) {
      this(var1, (byte)1);
   }

   public PacketClientbound02(ga var1, byte var2) {
      this.a = var1;
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = gb.a(var1.readString(32767));
      this.b = var1.readByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeString(gb.a(this.a));
      var1.writeByte(this.b);
   }

   public void a(gn var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("message=\'%s\'", new Object[]{this.a});
   }

   public boolean d() {
      return this.b == 1 || this.b == 2;
   }
}
