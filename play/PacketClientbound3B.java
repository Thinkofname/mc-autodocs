
public class PacketClientbound3B extends gf {

   private String a;
   private String b;
   private int c;


   public PacketClientbound3B() {}

   public PacketClientbound3B(bbh var1, int var2) {
      this.a = var1.b();
      this.b = var1.d();
      this.c = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(16);
      this.b = var1.readString(32);
      this.c = var1.readByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeString(this.b);
      var1.writeByte(this.c);
   }

   public void a(gi var1) {
      var1.a(this);
   }
}
