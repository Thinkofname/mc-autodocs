
public class PacketServerbound07 extends gk {

   private Position a;
   private dh b;
   private kc c;


   public void read(PacketBuffer var1) {
      this.c = kc.a(var1.readUnsignedByte());
      this.a = var1.readPosition();
      this.b = dh.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(kc.a(this.c));
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(ji var1) {
      var1.a(this);
   }

   public Position c() {
      return this.a;
   }

   public dh d() {
      return this.b;
   }

   public kc e() {
      return this.c;
   }
}
