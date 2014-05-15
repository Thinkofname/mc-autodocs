
public class PacketClientbound16 extends im {

   public PacketClientbound16() {
      this.g = true;
   }

   public PacketClientbound16(int var1, byte var2, byte var3) {
      super(var1);
      this.e = var2;
      this.f = var3;
      this.g = true;
   }

   public void read(PacketBuffer var1) {
      super.a(var1);
      this.e = var1.readByte();
      this.f = var1.readByte();
   }

   public void write(PacketBuffer var1) {
      super.b(var1);
      var1.writeByte(this.e);
      var1.writeByte(this.f);
   }

   public String b() {
      return super.b() + String.format(", yRot=%d, xRot=%d", new Object[]{Byte.valueOf(this.e), Byte.valueOf(this.f)});
   }
}
