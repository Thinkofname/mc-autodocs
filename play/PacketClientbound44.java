
public class PacketClientbound44 extends gu {

   private ja a;
   private double b;
   private double c;
   private double d;
   private double e;
   private int f;


   public PacketClientbound44() {}

   public PacketClientbound44(double var1) {
      this.a = ja.a;
      this.d = var1;
   }

   public PacketClientbound44(double var1, double var3, int var5) {
      this.a = ja.b;
      this.e = var1;
      this.d = var3;
      this.f = var5;
   }

   public PacketClientbound44(double var1, double var3) {
      this.a = ja.c;
      this.b = var1;
      this.c = var3;
   }

   public void read(PacketBuffer var1) {
      this.a = ja.a()[var1.readVarInt()];
      switch(iz.a[this.a.ordinal()]) {
      case 1:
         this.d = var1.readDouble();
         break;
      case 2:
         this.e = var1.readDouble();
         this.d = var1.readDouble();
         this.f = var1.readVarInt();
         break;
      case 3:
         this.b = var1.readDouble();
         this.c = var1.readDouble();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(ja.a(this.a));
      switch(iz.a[this.a.ordinal()]) {
      case 1:
         var1.writeDouble(this.d);
         break;
      case 2:
         var1.writeDouble(this.e);
         var1.writeDouble(this.d);
         var1.writeVarInt(this.f);
         break;
      case 3:
         var1.writeDouble(this.b);
         var1.writeDouble(this.c);
      }

   }

   public void a(gx var1) {
      var1.a(this);
   }
}
