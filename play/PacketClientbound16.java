
public class PacketClientbound16 extends is {

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
}
