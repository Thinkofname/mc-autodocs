
public class PacketServerbound0B implements gx {

   private int a;
   private lc b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (lc)var1.a(lc.class);
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.a(this.b);
      var1.writeVarInt(this.c);
   }

   public void a(kg var1) {
      var1.a(this);
   }

   public lc b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
