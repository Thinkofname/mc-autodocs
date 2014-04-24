
public class PacketClientbound23 extends gu {

   private Position a;
   private anj b;
   private int c;


   public PacketClientbound23() {}

   public PacketClientbound23(aky var1, Position var2) {
      this.a = var2;
      this.b = var1.c(var2);
      this.c = var1.g(var2);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = anj.f(var1.readVarInt());
      this.c = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
      var1.writeVarInt(anj.b(this.b));
      var1.writeByte(this.c);
   }

   public void a(gx var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("type=%d, data=%d, pos=%s", new Object[]{Integer.valueOf(anj.b(this.b)), Integer.valueOf(this.c), this.a});
   }
}
