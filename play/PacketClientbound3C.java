
public class PacketClientbound3C implements hz {

   private String a = "";
   private String b = "";
   private int c;
   private la d;


   public PacketClientbound3C() {}

   public PacketClientbound3C(bpo var1) {
      this.a = var1.e();
      this.b = var1.d().b();
      this.c = var1.c();
      this.d = la.a;
   }

   public PacketClientbound3C(String var1) {
      this.a = var1;
      this.b = "";
      this.c = 0;
      this.d = la.b;
   }

   public PacketClientbound3C(String var1, bpm var2) {
      this.a = var1;
      this.b = var2.b();
      this.c = 0;
      this.d = la.b;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(40);
      this.d = (la)var1.readEnum(la.class);
      this.b = var1.readString(16);
      if(this.d != la.b) {
         this.c = var1.readVarInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeEnum(this.d);
      var1.writeString(this.b);
      if(this.d != la.b) {
         var1.writeVarInt(this.c);
      }

   }

   public void a(ig var1) {
      var1.a(this);
   }
}
