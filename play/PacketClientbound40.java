
public class PacketClientbound40 extends fq {

   private fg a;


   public PacketClientbound40() {}

   public PacketClientbound40(fg var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = fh.a(var1.readString(32767));
   }

   public void write(PacketBuffer var1) {
      var1.writeString(fh.a(this.a));
   }

   public void a(fs var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
