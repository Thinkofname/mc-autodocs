
public class PacketClientbound3B extends gv {

   private String a;
   private String b;
   private bje c;
   private int d;


   public PacketClientbound3B() {}

   public PacketClientbound3B(bir var1, int var2) {
      this.a = var1.b();
      this.b = var1.d();
      this.c = var1.c().c();
      this.d = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(16);
      this.d = var1.readByte();
      if(this.d == 0 || this.d == 2) {
         this.b = var1.readString(32);
         this.c = bje.a(var1.readString(16));
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeByte(this.d);
      if(this.d == 0 || this.d == 2) {
         var1.writeString(this.b);
         var1.writeString(this.c.a());
      }

   }

   public void a(gy var1) {
      var1.a(this);
   }
}
