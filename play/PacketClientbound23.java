
public class PacketClientbound23 extends gf {

   private Position a;
   private aju b;
   private int c;


   public PacketClientbound23() {}

   public PacketClientbound23(ahn var1, Position var2) {
      this.a = var2;
      this.b = var1.c(var2);
      this.c = var1.g(var2);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = aju.e(var1.readVarInt());
      this.c = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
      var1.writeVarInt(aju.b(this.b));
      var1.writeByte(this.c);
   }

   public void a(gi var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("type=%d, data=%d, pos=%s", new Object[]{Integer.valueOf(aju.b(this.b)), Integer.valueOf(this.c), this.a});
   }
}
