
public class PacketServerbound02 implements hb {

   private int a;
   private ky b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (ky)var1.readEnum(ky.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
   }

   public void a(km var1) {
      var1.a(this);
   }

   public ue a(aly var1) {
      return var1.a(this.a);
   }

   public ky a() {
      return this.b;
   }
}
