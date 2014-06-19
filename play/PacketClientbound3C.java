
public class PacketClientbound3C implements ha {

   private String a = "";
   private String b = "";
   private int c;
   private jz d;


   public PacketClientbound3C() {}

   public PacketClientbound3C(bkr var1) {
      this.a = var1.e();
      this.b = var1.d().b();
      this.c = var1.c();
      this.d = jz.a;
   }

   public PacketClientbound3C(String var1) {
      this.a = var1;
      this.b = "";
      this.c = 0;
      this.d = jz.b;
   }

   public PacketClientbound3C(String var1, bkp var2) {
      this.a = var1;
      this.b = var2.b();
      this.c = 0;
      this.d = jz.b;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(40);
      this.d = (jz)var1.readEnum(jz.class);
      this.b = var1.readString(16);
      if(this.d != jz.b) {
         this.c = var1.readVarInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeEnum(this.d);
      var1.writeString(this.b);
      if(this.d != jz.b) {
         var1.writeVarInt(this.c);
      }

   }

   public void a(hg var1) {
      var1.a(this);
   }
}
