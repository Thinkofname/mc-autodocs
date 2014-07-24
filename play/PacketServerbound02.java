
public class PacketServerbound02 implements ib {

   private int a;
   private ma b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (ma)var1.readEnum(ma.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
   }

   public void a(lo var1) {
      var1.a(this);
   }

   public wk a(aqa var1) {
      return var1.a(this.a);
   }

   public ma a() {
      return this.b;
   }
}
