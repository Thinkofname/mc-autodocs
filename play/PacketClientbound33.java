
public class PacketClientbound33 implements ib {

   private aqa a;
   private Position b;
   private hm[] c;


   public PacketClientbound33() {}

   public PacketClientbound33(aqa var1, Position var2, hm[] var3) {
      this.a = var1;
      this.b = var2;
      this.c = new hm[]{var3[0], var3[1], var3[2], var3[3]};
   }

   public void read(PacketBuffer var1) {
      this.b = var1.readPosition();
      this.c = new hm[4];

      for(int var2 = 0; var2 < 4; ++var2) {
         this.c[var2] = var1.d();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.b);

      for(int var2 = 0; var2 < 4; ++var2) {
         var1.a(this.c[var2]);
      }

   }

   public void a(ii var1) {
      var1.a(this);
   }
}
