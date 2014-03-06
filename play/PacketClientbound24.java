
public class PacketClientbound24 extends gs {

   private Position a;
   private int b;
   private int c;
   private amg d;


   public PacketClientbound24() {}

   public PacketClientbound24(Position var1, amg var2, int var3, int var4) {
      this.a = var1;
      this.b = var3;
      this.c = var4;
      this.d = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
      this.b = var1.readUnsignedByte();
      this.c = var1.readUnsignedByte();
      this.d = amg.e(var1.readVarInt() & 4095);
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
      var1.writeByte(this.b);
      var1.writeByte(this.c);
      var1.writeVarInt(amg.b(this.d) & 4095);
   }

   public void a(gv var1) {
      var1.a(this);
   }
}
