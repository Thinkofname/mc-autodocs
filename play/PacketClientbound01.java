
public class PacketClientbound01 implements hb {

   private int a;
   private boolean b;
   private amg c;
   private int d;
   private te e;
   private int f;
   private ami g;


   public PacketClientbound01() {}

   public PacketClientbound01(int var1, amg var2, boolean var3, int var4, te var5, int var6, ami var7) {
      this.a = var1;
      this.d = var4;
      this.e = var5;
      this.c = var2;
      this.f = var6;
      this.b = var3;
      this.g = var7;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      short var2 = var1.readUnsignedByte();
      this.b = (var2 & 8) == 8;
      int var3 = var2 & -9;
      this.c = amg.a(var3);
      this.d = var1.readByte();
      this.e = te.a(var1.readUnsignedByte());
      this.f = var1.readUnsignedByte();
      this.g = ami.a(var1.readString(16));
      if(this.g == null) {
         this.g = ami.b;
      }

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
   }

   public void a(hh var1) {
      var1.a(this);
   }
}
