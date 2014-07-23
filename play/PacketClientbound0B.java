
public class PacketClientbound0B implements ib {

   private int a;
   private int b;


   public PacketClientbound0B() {}

   public PacketClientbound0B(wi var1, int var2) {
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

   public void a(ii var1) {
      var1.a(this);
   }
}
