import java.util.List;

public class PacketClientbound0F extends fr {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private byte i;
   private byte j;
   private byte k;
   private tb l;
   private List m;


   public PacketClientbound0F() {}

   public PacketClientbound0F(ss var1) {
      this.a = var1.x();
      this.b = (byte)sd.a(var1);
      this.c = var1.as.a(var1.s);
      this.d = qe.c(var1.t * 32.0D);
      this.e = var1.as.a(var1.u);
      this.i = (byte)((int)(var1.y * 256.0F / 360.0F));
      this.j = (byte)((int)(var1.z * 256.0F / 360.0F));
      this.k = (byte)((int)(var1.aO * 256.0F / 360.0F));
      double var2 = 3.9D;
      double var4 = var1.v;
      double var6 = var1.w;
      double var8 = var1.x;
      if(var4 < -var2) {
         var4 = -var2;
      }

      if(var6 < -var2) {
         var6 = -var2;
      }

      if(var8 < -var2) {
         var8 = -var2;
      }

      if(var4 > var2) {
         var4 = var2;
      }

      if(var6 > var2) {
         var6 = var2;
      }

      if(var8 > var2) {
         var8 = var2;
      }

      this.f = (int)(var4 * 8000.0D);
      this.g = (int)(var6 * 8000.0D);
      this.h = (int)(var8 * 8000.0D);
      this.l = var1.y();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readByte() & 255;
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.i = var1.readByte();
      this.j = var1.readByte();
      this.k = var1.readByte();
      this.f = var1.readShort();
      this.g = var1.readShort();
      this.h = var1.readShort();
      this.m = tb.b(var1);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(this.b & 255);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.i);
      var1.writeByte(this.j);
      var1.writeByte(this.k);
      var1.writeShort(this.f);
      var1.writeShort(this.g);
      var1.writeShort(this.h);
      this.l.a(var1);
   }

   public void a(ft var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f, xd=%.2f, yd=%.2f, zd=%.2f", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Float.valueOf((float)this.c / 32.0F), Float.valueOf((float)this.d / 32.0F), Float.valueOf((float)this.e / 32.0F), Float.valueOf((float)this.f / 8000.0F), Float.valueOf((float)this.g / 8000.0F), Float.valueOf((float)this.h / 8000.0F)});
   }
}
