
public class PacketClientbound23 implements hb {

   private Position a;
   private aoi b;
   private int c;


   public PacketClientbound23() {}

   public PacketClientbound23(alx var1, Position var2) {
      this.a = var2;
      this.b = var1.c(var2);
      this.c = var1.g(var2);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = aoi.d(var1.readVarInt());
      this.c = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
      var1.writeVarInt(aoi.a(this.b));
      var1.writeByte(this.c);
   }

   public void a(hh var1) {
      var1.a(this);
   }
}
