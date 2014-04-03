
public class PacketServerbound02 extends fr {

   private int a;
   private iz b;


   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = iz.a()[var1.readByte() % iz.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(iz.a(this.b));
   }

   public void a(im var1) {
      var1.a(this);
   }

   public rw a(agx var1) {
      return var1.a(this.a);
   }

   public iz c() {
      return this.b;
   }
}
