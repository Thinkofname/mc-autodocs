
public class PacketServerbound02 implements hb {

   private int a;
   private kx b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (kx)var1.readEnum(kx.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
   }

   public void a(kl var1) {
      var1.a(this);
   }

   public ud a(alx var1) {
      return var1.a(this.a);
   }

   public kx a() {
      return this.b;
   }
}
