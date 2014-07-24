
public class PacketClientbound07 implements ib {

   private int a;
   private vi b;
   private aqi c;
   private aqk d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, vi var2, aqk var3, aqi var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(ii var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = vi.a(var1.readUnsignedByte());
      this.c = aqi.a(var1.readUnsignedByte());
      this.d = aqk.a(var1.readString(16));
      if(this.d == null) {
         this.d = aqk.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
