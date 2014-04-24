
public class PacketServerbound07 extends gu {

   private Position a;
   private dq b;
   private kp c;


   public void read(PacketBuffer var1) {
      this.c = kp.a(var1.readUnsignedByte());
      this.a = var1.readPosition();
      this.b = dq.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(kp.a(this.c));
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(jv var1) {
      var1.a(this);
   }

   public Position c() {
      return this.a;
   }

   public dq d() {
      return this.b;
   }

   public kp e() {
      return this.c;
   }
}
