
public class PacketServerbound07 extends gj {

   private Position a;
   private dg b;
   private kb c;


   public void read(PacketBuffer var1) {
      this.c = kb.a(var1.readUnsignedByte());
      this.a = var1.readPosition();
      this.b = dg.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(kb.a(this.c));
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(jh var1) {
      var1.a(this);
   }

   public Position c() {
      return this.a;
   }

   public dg d() {
      return this.b;
   }

   public kb e() {
      return this.c;
   }
}
