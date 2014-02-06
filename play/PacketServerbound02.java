
public class PacketServerbound02 extends gm {

   private int a;
   private jw b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = jw.a()[var1.readUnsignedByte() % jw.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(jw.a(this.b));
   }

   public void a(jk var1) {
      var1.a(this);
   }

   public sd a(ait var1) {
      return var1.a(this.a);
   }

   public jw c() {
      return this.b;
   }
}
