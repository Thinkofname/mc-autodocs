
public class PacketClientbound19 extends gk {

   private int a;
   private byte b;


   public PacketClientbound19() {}

   public PacketClientbound19(sb var1, byte var2) {
      this.a = var1.A();
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

   public void a(gn var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, rot=%d", new Object[]{Integer.valueOf(this.a), Byte.valueOf(this.b)});
   }
}
