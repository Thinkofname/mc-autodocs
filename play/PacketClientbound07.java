
public class PacketClientbound07 extends gj {

   private int a;
   private qx b;
   private aib c;
   private aid d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, qx var2, aid var3, aib var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(gm var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = qx.a(var1.readUnsignedByte());
      this.c = aib.a(var1.readUnsignedByte());
      this.d = aid.a(var1.readString(16));
      if(this.d == null) {
         this.d = aid.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
