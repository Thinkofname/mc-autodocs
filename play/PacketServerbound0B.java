
public class PacketServerbound0B implements hz {

   private int a;
   private mh b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (mh)var1.readEnum(mh.class);
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
      var1.writeVarInt(this.c);
   }

   public void a(ll var1) {
      var1.a(this);
   }

   public mh b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
