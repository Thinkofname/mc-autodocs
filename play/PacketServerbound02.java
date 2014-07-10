
public class PacketServerbound02 implements hz {

   private int a;
   private ly b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (ly)var1.readEnum(ly.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
   }

   public void a(lm var1) {
      var1.a(this);
   }

   public wg a(apo var1) {
      return var1.a(this.a);
   }

   public ly a() {
      return this.b;
   }
}
