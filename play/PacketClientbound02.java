
public class PacketClientbound02 extends ft {

   private fj a;
   private boolean b;


   public PacketClientbound02() {
      this.b = true;
   }

   public PacketClientbound02(fj var1) {
      this(var1, true);
   }

   public PacketClientbound02(fj var1, boolean var2) {
      this.b = true;
      this.a = var1;
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = fk.a(var1.readString(32767));
   }

   public void write(PacketBuffer var1) {
      var1.writeString(fk.a(this.a));
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("message=\'%s\'", new Object[]{this.a});
   }

   public boolean d() {
      return this.b;
   }
}
