
public class PacketClientbound3C implements hf {

   private String a = "";
   private String b = "";
   private int c;
   private kf d;


   public PacketClientbound3C() {}

   public PacketClientbound3C(blq var1) {
      this.a = var1.e();
      this.b = var1.d().b();
      this.c = var1.c();
      this.d = kf.a;
   }

   public PacketClientbound3C(String var1) {
      this.a = var1;
      this.b = "";
      this.c = 0;
      this.d = kf.b;
   }

   public PacketClientbound3C(String var1, blo var2) {
      this.a = var1;
      this.b = var2.b();
      this.c = 0;
      this.d = kf.b;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(40);
      this.d = (kf)var1.readEnum(kf.class);
      this.b = var1.readString(16);
      if(this.d != kf.b) {
         this.c = var1.readVarInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeEnum(this.d);
      var1.writeString(this.b);
      if(this.d != kf.b) {
         var1.writeVarInt(this.c);
      }

   }

   public void a(hl var1) {
      var1.a(this);
   }
}
