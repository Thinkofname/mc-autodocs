
public class PacketClientbound44 extends gu {

   private ja a;
   private int b;
   private double c;
   private double d;
   private double e;
   private double f;
   private int g;


   public PacketClientbound44() {}

   public PacketClientbound44(axr var1) {
      this.a = ja.d;
      this.c = var1.f();
      this.d = var1.g();
      this.f = var1.h();
      this.e = var1.j();
      this.g = var1.i();
      this.b = var1.l();
   }

   public PacketClientbound44(double var1) {
      this.a = ja.a;
      this.e = var1;
   }

   public PacketClientbound44(double var1, double var3, int var5) {
      this.a = ja.b;
      this.f = var1;
      this.e = var3;
      this.g = var5;
   }

   public PacketClientbound44(double var1, double var3) {
      this.a = ja.c;
      this.c = var1;
      this.d = var3;
   }

   public void read(PacketBuffer var1) {
      this.a = ja.a()[var1.readVarInt()];
      switch(iz.a[this.a.ordinal()]) {
      case 1:
         this.e = var1.readDouble();
         break;
      case 2:
         this.f = var1.readDouble();
         this.e = var1.readDouble();
         this.g = var1.readVarInt();
         break;
      case 3:
         this.c = var1.readDouble();
         this.d = var1.readDouble();
         break;
      case 4:
         this.c = var1.readDouble();
         this.d = var1.readDouble();
         this.f = var1.readDouble();
         this.e = var1.readDouble();
         this.g = var1.readVarInt();
         this.b = var1.readVarInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(ja.a(this.a));
      switch(iz.a[this.a.ordinal()]) {
      case 1:
         var1.writeDouble(this.e);
         break;
      case 2:
         var1.writeDouble(this.f);
         var1.writeDouble(this.e);
         var1.writeVarInt(this.g);
         break;
      case 3:
         var1.writeDouble(this.c);
         var1.writeDouble(this.d);
         break;
      case 4:
         var1.writeDouble(this.c);
         var1.writeDouble(this.d);
         var1.writeDouble(this.f);
         var1.writeDouble(this.e);
         var1.writeVarInt(this.g);
         var1.writeVarInt(this.b);
      }

   }

   public void a(gx var1) {
      var1.a(this);
   }
}
