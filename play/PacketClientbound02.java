
public class PacketClientbound02 extends ga {

   private fq a;
   private byte b;


   public PacketClientbound02() {}

   public PacketClientbound02(fq var1) {
      this(var1, (byte)1);
   }

   public PacketClientbound02(fq var1, byte var2) {
      this.a = var1;
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = fr.a(var1.readString(32767));
      this.b = var1.readByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeString(fr.a(this.a));
      var1.writeByte(this.b);
   }

   public void a(gd var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("message=\'%s\'", new Object[]{this.a});
   }

   public boolean d() {
      return this.b == 1 || this.b == 2;
   }
}
