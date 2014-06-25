
public class PacketClientbound25 implements hb {

   private int a;
   private Position b;
   private int c;


   public PacketClientbound25() {}

   public PacketClientbound25(int var1, Position var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readPosition();
      this.c = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writePosition(this.b);
      var1.writeByte(this.c);
   }

   public void a(hh var1) {
      var1.a(this);
   }
}
