
public class PacketServerbound02 extends gt {

   private int a;
   private kd b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = kd.a()[var1.readUnsignedByte() % kd.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(kd.a(this.b));
   }

   public void a(jr var1) {
      var1.a(this);
   }

   public tj a(akh var1) {
      return var1.a(this.a);
   }

   public kd c() {
      return this.b;
   }
}
