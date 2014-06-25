
public class PacketServerbound12 implements hb {

   private Position a;
   private go[] b;


   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = new go[4];

      for(int var2 = 0; var2 < 4; ++var2) {
         this.b[var2] = var1.d();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);

      for(int var2 = 0; var2 < 4; ++var2) {
         var1.a(this.b[var2]);
      }

   }

   public void a(kl var1) {
      var1.a(this);
   }

   public Position a() {
      return this.a;
   }

   public go[] b() {
      return this.b;
   }
}
