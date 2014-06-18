
public class PacketServerbound02 implements ha {

   private int a;
   private kw b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (kw)var1.readEnum(kw.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
   }

   public void a(kk var1) {
      var1.a(this);
   }

   public ub a(alu var1) {
      return var1.a(this.a);
   }

   public kw a() {
      return this.b;
   }
}
