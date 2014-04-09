
public class PacketServerbound02 extends ft {

   private int a;
   private jb b;


   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = jb.a()[var1.readByte() % jb.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(jb.a(this.b));
   }

   public void a(io var1) {
      var1.a(this);
   }

   public rz a(aha var1) {
      return var1.a(this.a);
   }

   public jb c() {
      return this.b;
   }
}
