
public class PacketServerbound01 extends gs {

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

   public void a(jq var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("message=\'%s\'", new Object[]{this.a});
   }

   public String c() {
      return this.a;
   }
}
