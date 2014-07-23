
public class PacketServerbound07 implements ib {

   private Position a;
   private ek b;
   private mi c;


   public void read(PacketBuffer var1) {
      this.c = (mi)var1.readEnum(mi.class);
      this.a = var1.readPosition();
      this.b = ek.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.c);
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(lo var1) {
      var1.a(this);
   }

   public Position a() {
      return this.a;
   }

   public ek b() {
      return this.b;
   }

   public mi c() {
      return this.c;
   }
}
