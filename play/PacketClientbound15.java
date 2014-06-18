
public class PacketClientbound15 extends is {

   public PacketClientbound15() {}

   public PacketClientbound15(int var1, byte var2, byte var3, byte var4) {
      super(var1);
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public void read(PacketBuffer var1) {
      super.a(var1);
      this.b = var1.readByte();
      this.c = var1.readByte();
      this.d = var1.readByte();
   }

   public void write(PacketBuffer var1) {
      super.b(var1);
      var1.writeByte(this.b);
      var1.writeByte(this.c);
      var1.writeByte(this.d);
   }
}
