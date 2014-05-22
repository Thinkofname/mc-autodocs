
public class PacketServerbound07 implements gx {

   private Position a;
   private dr b;
   private la c;


   public void read(PacketBuffer var1) {
      this.c = (la)var1.a(la.class);
      this.a = var1.readPosition();
      this.b = dr.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.a(this.c);
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(kg var1) {
      var1.a(this);
   }

   public Position a() {
      return this.a;
   }

   public dr b() {
      return this.b;
   }

   public la c() {
      return this.c;
   }
}
