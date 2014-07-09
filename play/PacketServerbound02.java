
public class PacketServerbound02 implements hz {

   private int a;
   private lx b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (lx)var1.readEnum(lx.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
   }

   public void a(ll var1) {
      var1.a(this);
   }

   public we a(apm var1) {
      return var1.a(this.a);
   }

   public lx a() {
      return this.b;
   }
}
