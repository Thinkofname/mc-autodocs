
public class PacketServerbound07 extends gf {

   private Position a;
   private de b;
   private jw c;


   public void read(PacketBuffer var1) {
      this.c = jw.a(var1.readUnsignedByte());
      this.a = var1.readPosition();
      this.b = de.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(jw.a(this.c));
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(jc var1) {
      var1.a(this);
   }

   public Position c() {
      return this.a;
   }

   public de d() {
      return this.b;
   }

   public jw e() {
      return this.c;
   }
}
