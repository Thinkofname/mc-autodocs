
public class PacketClientbound07 implements hz {

   private int a;
   private ve b;
   private apw c;
   private apy d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, ve var2, apy var3, apw var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(ig var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = ve.a(var1.readUnsignedByte());
      this.c = apw.a(var1.readUnsignedByte());
      this.d = apy.a(var1.readString(16));
      if(this.d == null) {
         this.d = apy.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
