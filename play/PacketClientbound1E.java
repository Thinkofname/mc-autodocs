
public class PacketClientbound1E extends gu {

   private int a;
   private int b;


   public PacketClientbound1E() {}

   public PacketClientbound1E(int var1, tl var2) {
      this.a = var1;
      this.b = var2.a();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(gx var1) {
      var1.a(this);
   }
}
