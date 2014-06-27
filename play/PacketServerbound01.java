
public class PacketServerbound01 implements hb {

   private String a;


   public PacketServerbound01() {}

   public PacketServerbound01(String var1) {
      if(var1.length() > 100) {
         var1 = var1.substring(0, 100);
      }

      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(100);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
   }

   public void a(km var1) {
      var1.a(this);
   }

   public String a() {
      return this.a;
   }
}
