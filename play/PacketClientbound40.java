
public class PacketClientbound40 extends ga {

   private fq a;


   public PacketClientbound40() {}

   public PacketClientbound40(fq var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = fr.a(var1.readString(32767));
   }

   public void write(PacketBuffer var1) {
      var1.writeString(fr.a(this.a));
   }

   public void a(gd var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
