
public class PacketClientbound41 implements ha {

   private tb a;
   private boolean b;


   public PacketClientbound41() {}

   public PacketClientbound41(tb var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(hg var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = tb.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a.a());
   }
}
