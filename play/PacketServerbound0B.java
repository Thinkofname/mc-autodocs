
public class PacketServerbound0B implements hz {

   private int a;
   private mi b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (mi)var1.readEnum(mi.class);
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
      var1.writeVarInt(this.c);
   }

   public void a(lm var1) {
      var1.a(this);
   }

   public mi b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
