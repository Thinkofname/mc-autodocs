
public class PacketServerbound02 implements hf {

   private int a;
   private lc b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (lc)var1.readEnum(lc.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
   }

   public void a(kq var1) {
      var1.a(this);
   }

   public um a(amp var1) {
      return var1.a(this.a);
   }

   public lc a() {
      return this.b;
   }
}
