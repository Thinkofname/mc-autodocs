
public class PacketClientbound23 extends gx {

   private Position a;
   private ans b;
   private int c;


   public PacketClientbound23() {}

   public PacketClientbound23(alh var1, Position var2) {
      this.a = var2;
      this.b = var1.c(var2);
      this.c = var1.g(var2);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = ans.f(var1.readVarInt());
      this.c = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
      var1.writeVarInt(ans.b(this.b));
      var1.writeByte(this.c);
   }

   public void a(ha var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("type=%d, data=%d, pos=%s", new Object[]{Integer.valueOf(ans.b(this.b)), Integer.valueOf(this.c), this.a});
   }
}
