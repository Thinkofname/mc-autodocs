
public class PacketServerbound16 implements ha {

   private ko a;


   public PacketServerbound16() {}

   public PacketServerbound16(ko var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = (ko)var1.readEnum(ko.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.a);
   }

   public void a(kk var1) {
      var1.a(this);
   }

   public ko a() {
      return this.a;
   }
}
