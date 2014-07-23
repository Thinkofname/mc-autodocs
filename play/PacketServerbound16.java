
public class PacketServerbound16 implements ib {

   private ls a;


   public PacketServerbound16() {}

   public PacketServerbound16(ls var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = (ls)var1.readEnum(ls.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.a);
   }

   public void a(lo var1) {
      var1.a(this);
   }

   public ls a() {
      return this.a;
   }
}
