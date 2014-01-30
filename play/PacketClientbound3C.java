
public class PacketClientbound3C extends gj {

   private String a = "";
   private String b = "";
   private int c;
   private int d;


   public PacketClientbound3C() {}

   public PacketClientbound3C(bbq var1, int var2) {
      this.a = var1.e();
      this.b = var1.d().b();
      this.c = var1.c();
      this.d = var2;
   }

   public PacketClientbound3C(String var1) {
      this.a = var1;
      this.b = "";
      this.c = 0;
      this.d = 1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(16);
      this.d = var1.readByte();
      if(this.d != 1) {
         this.b = var1.readString(16);
         this.c = var1.readVarInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeByte(this.d);
      if(this.d != 1) {
         var1.writeString(this.b);
         var1.writeVarInt(this.c);
      }

   }

   public void a(gm var1) {
      var1.a(this);
   }
}
