
public class PacketServerbound02 extends gx {

   private int a;
   private kp b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = kp.a()[var1.readUnsignedByte() % kp.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(kp.a(this.b));
   }

   public void a(kd var1) {
      var1.a(this);
   }

   public ty a(alh var1) {
      return var1.a(this.a);
   }

   public kp c() {
      return this.b;
   }
}
