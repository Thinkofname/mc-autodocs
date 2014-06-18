
public class PacketClientbound23 implements ha {

   private Position a;
   private aof b;
   private int c;


   public PacketClientbound23() {}

   public PacketClientbound23(alu var1, Position var2) {
      this.a = var2;
      this.b = var1.c(var2);
      this.c = var1.g(var2);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = aof.c(var1.readVarInt());
      this.c = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
      var1.writeVarInt(aof.a(this.b));
      var1.writeByte(this.c);
   }

   public void a(hg var1) {
      var1.a(this);
   }
}
