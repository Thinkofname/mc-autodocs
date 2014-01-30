
public class PacketServerbound02 extends gj {

   private int a;
   private jt b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = jt.a()[var1.readUnsignedByte() % jt.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(jt.a(this.b));
   }

   public void a(jh var1) {
      var1.a(this);
   }

   public rz a(aht var1) {
      return var1.a(this.a);
   }

   public jt c() {
      return this.b;
   }
}
