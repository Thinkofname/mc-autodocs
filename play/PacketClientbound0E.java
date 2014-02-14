
public class PacketClientbound0E extends gs {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;


   public PacketClientbound0E() {}

   public PacketClientbound0E(sk var1, int var2) {
      this(var1, var2, 0);
   }

   public PacketClientbound0E(sk var1, int var2, int var3) {
      this.a = var1.A();
      this.b = qn.c(var1.s * 32.0D);
      this.c = qn.c(var1.t * 32.0D);
      this.d = qn.c(var1.u * 32.0D);
      this.h = qn.d(var1.z * 256.0F / 360.0F);
      this.i = qn.d(var1.y * 256.0F / 360.0F);
      this.j = var2;
      this.k = var3;
      if(var3 > 0) {
         double var4 = var1.v;
         double var6 = var1.w;
         double var8 = var1.x;
         double var10 = 3.9D;
         if(var4 < -var10) {
            var4 = -var10;
         }

         if(var6 < -var10) {
            var6 = -var10;
         }

         if(var8 < -var10) {
            var8 = -var10;
         }

         if(var4 > var10) {
            var4 = var10;
         }

         if(var6 > var10) {
            var6 = var10;
         }

         if(var8 > var10) {
            var8 = var10;
         }

         this.e = (int)(var4 * 8000.0D);
         this.f = (int)(var6 * 8000.0D);
         this.g = (int)(var8 * 8000.0D);
      }

   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.j = var1.readByte();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.h = var1.readByte();
      this.i = var1.readByte();
      this.k = var1.readInt();
      if(this.k > 0) {
         this.e = var1.readShort();
         this.f = var1.readShort();
         this.g = var1.readShort();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(this.j);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeByte(this.h);
      var1.writeByte(this.i);
      var1.writeInt(this.k);
      if(this.k > 0) {
         var1.writeShort(this.e);
         var1.writeShort(this.f);
         var1.writeShort(this.g);
      }

   }

   public void a(gv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.j), Float.valueOf((float)this.b / 32.0F), Float.valueOf((float)this.c / 32.0F), Float.valueOf((float)this.d / 32.0F)});
   }

   public void a(int var1) {
      this.b = var1;
   }

   public void b(int var1) {
      this.c = var1;
   }

   public void c(int var1) {
      this.d = var1;
   }

   public void d(int var1) {
      this.e = var1;
   }

   public void e(int var1) {
      this.f = var1;
   }

   public void f(int var1) {
      this.g = var1;
   }
}
