
public class PacketServerbound0B implements ha {

   private int a;
   private lg b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (lg)var1.readEnum(lg.class);
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
      var1.writeVarInt(this.c);
   }

   public void a(kk var1) {
      var1.a(this);
   }

   public lg b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
