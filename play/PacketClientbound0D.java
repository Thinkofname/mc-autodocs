
public class PacketClientbound0D implements gx {

   private int a;
   private int b;


   public PacketClientbound0D() {}

   public PacketClientbound0D(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeVarInt(this.b);
   }

   public void a(hc var1) {
      var1.a(this);
   }
}
