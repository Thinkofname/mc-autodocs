
public class PacketServerbound0B implements hb {

   private int a;
   private li b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (li)var1.readEnum(li.class);
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
      var1.writeVarInt(this.c);
   }

   public void a(km var1) {
      var1.a(this);
   }

   public li b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
