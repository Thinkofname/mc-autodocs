
public class PacketServerbound07 extends ga {

   private cu a;
   private dc b;
   private int c;


   public void read(PacketBuffer var1) {
      this.c = var1.readUnsignedByte();
      this.a = var1.readPosition();
      this.b = dc.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.c);
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(ix var1) {
      var1.a(this);
   }

   public cu c() {
      return this.a;
   }

   public dc d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
