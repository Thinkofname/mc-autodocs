
public class PacketClientbound3C implements hb {

   private String a = "";
   private String b = "";
   private int c;
   private kb d;


   public PacketClientbound3C() {}

   public PacketClientbound3C(bkx var1) {
      this.a = var1.e();
      this.b = var1.d().b();
      this.c = var1.c();
      this.d = kb.a;
   }

   public PacketClientbound3C(String var1) {
      this.a = var1;
      this.b = "";
      this.c = 0;
      this.d = kb.b;
   }

   public PacketClientbound3C(String var1, bkv var2) {
      this.a = var1;
      this.b = var2.b();
      this.c = 0;
      this.d = kb.b;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(40);
      this.d = (kb)var1.readEnum(kb.class);
      this.b = var1.readString(16);
      if(this.d != kb.b) {
         this.c = var1.readVarInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeEnum(this.d);
      var1.writeString(this.b);
      if(this.d != kb.b) {
         var1.writeVarInt(this.c);
      }

   }

   public void a(hh var1) {
      var1.a(this);
   }
}
