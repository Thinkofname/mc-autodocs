
public class PacketServerbound07 implements ha {

   private Position a;
   private dt b;
   private le c;


   public void read(PacketBuffer var1) {
      this.c = (le)var1.readEnum(le.class);
      this.a = var1.readPosition();
      this.b = dt.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.c);
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(kk var1) {
      var1.a(this);
   }

   public Position a() {
      return this.a;
   }

   public dt b() {
      return this.b;
   }

   public le c() {
      return this.c;
   }
}
