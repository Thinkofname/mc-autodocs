
public class PacketClientbound40 extends gj {

   private fz a;


   public PacketClientbound40() {}

   public PacketClientbound40(fz var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = ga.a(var1.readString(32767));
   }

   public void write(PacketBuffer var1) {
      var1.writeString(ga.a(this.a));
   }

   public void a(gm var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
