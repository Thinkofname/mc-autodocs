
public class PacketServerbound07 implements hz {

   private Position a;
   private ei b;
   private mg c;


   public void read(PacketBuffer var1) {
      this.c = (mg)var1.readEnum(mg.class);
      this.a = var1.readPosition();
      this.b = ei.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.c);
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(lm var1) {
      var1.a(this);
   }

   public Position a() {
      return this.a;
   }

   public ei b() {
      return this.b;
   }

   public mg c() {
      return this.c;
   }
}
