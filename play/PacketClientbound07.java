
public class PacketClientbound07 implements gx {

   private int a;
   private sy b;
   private als c;
   private alu d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, sy var2, alu var3, als var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(hc var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = sy.a(var1.readUnsignedByte());
      this.c = als.a(var1.readUnsignedByte());
      this.d = alu.a(var1.readString(16));
      if(this.d == null) {
         this.d = alu.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
