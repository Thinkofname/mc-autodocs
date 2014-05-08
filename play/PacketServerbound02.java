
public class PacketServerbound02 extends gv {

   private int a;
   private kl b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = kl.a()[var1.readUnsignedByte() % kl.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(kl.a(this.b));
   }

   public void a(jz var1) {
      var1.a(this);
   }

   public tu a(ald var1) {
      return var1.a(this.a);
   }

   public kl c() {
      return this.b;
   }
}
