
public class PacketServerbound02 extends gk {

   private int a;
   private ju b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = ju.a()[var1.readUnsignedByte() % ju.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(ju.a(this.b));
   }

   public void a(ji var1) {
      var1.a(this);
   }

   public sb a(air var1) {
      return var1.a(this.a);
   }

   public ju c() {
      return this.b;
   }
}
