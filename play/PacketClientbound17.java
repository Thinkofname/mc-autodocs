
public class PacketClientbound17 extends ik {

   public PacketClientbound17() {
      this.g = true;
   }

   public PacketClientbound17(int var1, byte var2, byte var3, byte var4, byte var5, byte var6) {
      super(var1);
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = true;
   }

   public void read(PacketBuffer var1) {
      super.a(var1);
      this.b = var1.readByte();
      this.c = var1.readByte();
      this.d = var1.readByte();
      this.e = var1.readByte();
      this.f = var1.readByte();
   }

   public void write(PacketBuffer var1) {
      super.b(var1);
      var1.writeByte(this.b);
      var1.writeByte(this.c);
      var1.writeByte(this.d);
      var1.writeByte(this.e);
      var1.writeByte(this.f);
   }

   public String b() {
      return super.b() + String.format(", xa=%d, ya=%d, za=%d, yRot=%d, xRot=%d", new Object[]{Byte.valueOf(this.b), Byte.valueOf(this.c), Byte.valueOf(this.d), Byte.valueOf(this.e), Byte.valueOf(this.f)});
   }
}
