
public class PacketServerbound12 extends ga {

   private cu a;
   private String[] b;


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

   public void a(ix var1) {
      var1.a(this);
   }

   public cu c() {
      return this.a;
   }

   public String[] d() {
      return this.b;
   }
}
