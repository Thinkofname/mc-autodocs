
public class PacketClientbound3C implements hb {

   private String a = "";
   private String b = "";
   private int c;
   private ka d;


   public PacketClientbound3C() {}

   public PacketClientbound3C(bkw var1) {
      this.a = var1.e();
      this.b = var1.d().b();
      this.c = var1.c();
      this.d = ka.a;
   }

   public PacketClientbound3C(String var1) {
      this.a = var1;
      this.b = "";
      this.c = 0;
      this.d = ka.b;
   }

   public PacketClientbound3C(String var1, bku var2) {
      this.a = var1;
      this.b = var2.b();
      this.c = 0;
      this.d = ka.b;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(40);
      this.d = (ka)var1.readEnum(ka.class);
      this.b = var1.readString(16);
      if(this.d != ka.b) {
         this.c = var1.readVarInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeEnum(this.d);
      var1.writeString(this.b);
      if(this.d != ka.b) {
         var1.writeVarInt(this.c);
      }

   }

   public void a(hh var1) {
      var1.a(this);
   }
}
