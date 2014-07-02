
public class PacketServerbound16 implements hf {

   private ku a;


   public PacketServerbound16() {}

   public PacketServerbound16(ku var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = (ku)var1.readEnum(ku.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.a);
   }

   public void a(kq var1) {
      var1.a(this);
   }

   public ku a() {
      return this.a;
   }
}
