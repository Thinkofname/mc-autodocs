
public class PacketClientbound07 extends gf {

   private int a;
   private qs b;
   private ahv c;
   private ahx d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, qs var2, ahx var3, ahv var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(gi var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = qs.a(var1.readUnsignedByte());
      this.c = ahv.a(var1.readUnsignedByte());
      this.d = ahx.a(var1.readString(16));
      if(this.d == null) {
         this.d = ahx.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
