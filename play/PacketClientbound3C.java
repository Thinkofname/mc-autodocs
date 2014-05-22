
public class PacketClientbound3C implements gx {

   private String a = "";
   private String b = "";
   private int c;
   private jv d;


   public PacketClientbound3C() {}

   public PacketClientbound3C(bja var1) {
      this.a = var1.e();
      this.b = var1.d().b();
      this.c = var1.c();
      this.d = jv.a;
   }

   public PacketClientbound3C(String var1) {
      this.a = var1;
      this.b = "";
      this.c = 0;
      this.d = jv.b;
   }

   public PacketClientbound3C(String var1, biy var2) {
      this.a = var1;
      this.b = var2.b();
      this.c = 0;
      this.d = jv.b;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(40);
      this.d = (jv)var1.a(jv.class);
      if(this.d != jv.b) {
         this.b = var1.readString(16);
         this.c = var1.readVarInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.a(this.d);
      if(this.d != jv.b) {
         var1.writeString(this.b);
         var1.writeVarInt(this.c);
      }

   }

   public void a(hc var1) {
      var1.a(this);
   }
}
