
public class PacketClientbound02 extends fr {

   private fh a;
   private boolean b;


   public PacketClientbound02() {
      this.b = true;
   }

   public PacketClientbound02(fh var1) {
      this(var1, true);
   }

   public PacketClientbound02(fh var1, boolean var2) {
      this.b = true;
      this.a = var1;
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = fi.a(var1.readString(32767));
   }

   public void write(PacketBuffer var1) {
      var1.writeString(fi.a(this.a));
   }

   public void a(ft var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("message=\'%s\'", new Object[]{this.a});
   }

   public boolean d() {
      return this.b;
   }
}
