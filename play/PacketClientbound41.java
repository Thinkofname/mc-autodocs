
public class PacketClientbound41 implements ib {

   private vi a;
   private boolean b;


   public PacketClientbound41() {}

   public PacketClientbound41(vi var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(ii var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = vi.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a.a());
   }
}
