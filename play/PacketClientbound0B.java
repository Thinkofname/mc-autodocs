
public class PacketClientbound0B implements hz {

   private int a;
   private int b;


   public PacketClientbound0B() {}

   public PacketClientbound0B(wg var1, int var2) {
      this.a = var1.E();
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(ig var1) {
      var1.a(this);
   }
}
