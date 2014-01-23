
public class PacketServerbound02 extends gf {

   private int a;
   private jo b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = jo.a()[var1.readUnsignedByte() % jo.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(jo.a(this.b));
   }

   public void a(jc var1) {
      var1.a(this);
   }

   public ru a(ahn var1) {
      return var1.a(this.a);
   }

   public jo c() {
      return this.b;
   }
}
