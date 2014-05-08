
public class PacketClientbound33 extends gv {

   private Position a;
   private String[] b;


   public PacketClientbound33() {}

   public PacketClientbound33(Position var1, String[] var2) {
      this.a = var1;
      this.b = new String[]{var2[0], var2[1], var2[2], var2[3]};
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = new String[4];

      for(int var2 = 0; var2 < 4; ++var2) {
         this.b[var2] = var1.readString(15);
      }

   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);

      for(int var2 = 0; var2 < 4; ++var2) {
         var1.writeString(this.b[var2]);
      }

   }

   public void a(gy var1) {
      var1.a(this);
   }
}
