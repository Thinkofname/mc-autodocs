
public class PacketServerbound02 implements gx {

   private int a;
   private ks b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (ks)var1.readEnum(ks.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
   }

   public void a(kg var1) {
      var1.a(this);
   }

   public ub a(alk var1) {
      return var1.a(this.a);
   }

   public ks a() {
      return this.b;
   }
}
