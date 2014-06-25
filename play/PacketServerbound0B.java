
public class PacketServerbound0B implements hb {

   private int a;
   private lh b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (lh)var1.readEnum(lh.class);
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
      var1.writeVarInt(this.c);
   }

   public void a(kl var1) {
      var1.a(this);
   }

   public lh b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
