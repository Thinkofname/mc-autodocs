
public class PacketServerbound02 extends ga {

   private int a;
   private jk b;


   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = jk.a()[var1.readByte() % jk.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(jk.a(this.b));
   }

   public void a(ix var1) {
      var1.a(this);
   }

   public rl a(ahc var1) {
      return var1.a(this.a);
   }

   public jk c() {
      return this.b;
   }
}
