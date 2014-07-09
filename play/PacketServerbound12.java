
public class PacketServerbound12 implements hz {

   private Position a;
   private hk[] b;


   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = new hk[4];

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

   public void a(ll var1) {
      var1.a(this);
   }

   public Position a() {
      return this.a;
   }

   public hk[] b() {
      return this.b;
   }
}
