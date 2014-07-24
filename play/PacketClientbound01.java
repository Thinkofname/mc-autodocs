
public class PacketClientbound01 implements ib {

   private int a;
   private boolean b;
   private aqi c;
   private int d;
   private vi e;
   private int f;
   private aqk g;
   private boolean h;


   public PacketClientbound01() {}

   public PacketClientbound01(int var1, aqi var2, boolean var3, int var4, vi var5, int var6, aqk var7, boolean var8) {
      this.a = var1;
      this.d = var4;
      this.e = var5;
      this.c = var2;
      this.f = var6;
      this.b = var3;
      this.g = var7;
      this.h = var8;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      short var2 = var1.readUnsignedByte();
      this.b = (var2 & 8) == 8;
      int var3 = var2 & -9;
      this.c = aqi.a(var3);
      this.d = var1.readByte();
      this.e = vi.a(var1.readUnsignedByte());
      this.f = var1.readUnsignedByte();
      this.g = aqk.a(var1.readString(16));
      if(this.g == null) {
         this.g = aqk.b;
      }

      this.h = var1.readBoolean();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      int var2 = this.c.a();
      if(this.b) {
         var2 |= 8;
      }

      var1.writeByte(var2);
      var1.writeByte(this.d);
      var1.writeByte(this.e.a());
      var1.writeByte(this.f);
      var1.writeString(this.g.a());
      var1.writeBoolean(this.h);
   }

   public void a(ii var1) {
      var1.a(this);
   }
}
