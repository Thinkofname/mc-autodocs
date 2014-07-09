
public class PacketServerbound07 implements hz {

   private Position a;
   private ei b;
   private mf c;


   public void read(PacketBuffer var1) {
      this.c = (mf)var1.readEnum(mf.class);
      this.a = var1.readPosition();
      this.b = ei.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.c);
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(ll var1) {
      var1.a(this);
   }

   public Position a() {
      return this.a;
   }

   public ei b() {
      return this.b;
   }

   public mf c() {
      return this.c;
   }
}
