
public class PacketServerbound07 extends gv {

   private Position a;
   private dq b;
   private kt c;


   public void read(PacketBuffer var1) {
      this.c = kt.a(var1.readUnsignedByte());
      this.a = var1.readPosition();
      this.b = dq.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(kt.a(this.c));
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(jz var1) {
      var1.a(this);
   }

   public Position c() {
      return this.a;
   }

   public dq d() {
      return this.b;
   }

   public kt e() {
      return this.c;
   }
}
