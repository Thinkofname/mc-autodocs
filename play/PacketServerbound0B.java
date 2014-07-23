
public class PacketServerbound0B implements ib {

   private int a;
   private mk b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (mk)var1.readEnum(mk.class);
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
      var1.writeVarInt(this.c);
   }

   public void a(lo var1) {
      var1.a(this);
   }

   public mk b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
