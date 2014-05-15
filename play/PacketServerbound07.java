
public class PacketServerbound07 extends gx {

   private Position a;
   private dr b;
   private kx c;


   public void read(PacketBuffer var1) {
      this.c = kx.a(var1.readUnsignedByte());
      this.a = var1.readPosition();
      this.b = dr.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(kx.a(this.c));
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(kd var1) {
      var1.a(this);
   }

   public Position c() {
      return this.a;
   }

   public dr d() {
      return this.b;
   }

   public kx e() {
      return this.c;
   }
}
