
public class PacketServerbound02 extends gs {

   private int a;
   private kc b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = kc.a()[var1.readUnsignedByte() % kc.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(kc.a(this.b));
   }

   public void a(jq var1) {
      var1.a(this);
   }

   public sk a(aja var1) {
      return var1.a(this.a);
   }

   public kc c() {
      return this.b;
   }
}
