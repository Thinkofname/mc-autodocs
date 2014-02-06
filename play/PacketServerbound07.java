
public class PacketServerbound07 extends gm {

   private Position a;
   private dj b;
   private ke c;


   public void read(PacketBuffer var1) {
      this.c = ke.a(var1.readUnsignedByte());
      this.a = var1.readPosition();
      this.b = dj.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(ke.a(this.c));
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(jk var1) {
      var1.a(this);
   }

   public Position c() {
      return this.a;
   }

   public dj d() {
      return this.b;
   }

   public ke e() {
      return this.c;
   }
}
