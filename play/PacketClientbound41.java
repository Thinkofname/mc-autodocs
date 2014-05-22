
public class PacketClientbound41 implements gx {

   private sy a;
   private boolean b;


   public PacketClientbound41() {}

   public PacketClientbound41(sy var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(hc var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = sy.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a.a());
   }
}
