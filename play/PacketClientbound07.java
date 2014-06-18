
public class PacketClientbound07 implements ha {

   private int a;
   private tb b;
   private amc c;
   private ame d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, tb var2, ame var3, amc var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(hg var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = tb.a(var1.readUnsignedByte());
      this.c = amc.a(var1.readUnsignedByte());
      this.d = ame.a(var1.readString(16));
      if(this.d == null) {
         this.d = ame.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
