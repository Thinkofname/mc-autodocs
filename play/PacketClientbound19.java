
public class PacketClientbound19 implements ib {

   private int a;
   private byte b;


   public PacketClientbound19() {}

   public PacketClientbound19(wk var1, byte var2) {
      this.a = var1.E();
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(ii var1) {
      var1.a(this);
   }
}
