
public class PacketServerbound07 implements hb {

   private Position a;
   private du b;
   private lg c;


   public void read(PacketBuffer var1) {
      this.c = (lg)var1.readEnum(lg.class);
      this.a = var1.readPosition();
      this.b = du.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.c);
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(km var1) {
      var1.a(this);
   }

   public Position a() {
      return this.a;
   }

   public du b() {
      return this.b;
   }

   public lg c() {
      return this.c;
   }
}
