
public class PacketClientbound23 extends ft {

   private int a;
   private int b;
   private int c;
   private ajh d;
   private int e;


   public PacketClientbound23() {}

   public PacketClientbound23(int var1, int var2, int var3, aha var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4.a(var1, var2, var3);
      this.e = var4.e(var1, var2, var3);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readUnsignedByte();
      this.c = var1.readInt();
      this.d = ajh.e(var1.readVarInt());
      this.e = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
      var1.writeInt(this.c);
      var1.writeVarInt(ajh.b(this.d));
      var1.writeByte(this.e);
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("type=%d, data=%d, x=%d, y=%d, z=%d", new Object[]{Integer.valueOf(ajh.b(this.d)), Integer.valueOf(this.e), Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
   }
}
