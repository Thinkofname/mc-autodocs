
public class PacketClientbound34 implements hf {

   private int a;
   private byte[] b;


   public PacketClientbound34() {}

   public PacketClientbound34(int var1, byte[] var2) {
      this.a = var1;
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = new byte[var1.readUnsignedShort()];
      var1.readBytes(this.b);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeShort(this.b.length);
      var1.writeBytes(this.b);
   }

   public void a(hl var1) {
      var1.a(this);
   }
}
