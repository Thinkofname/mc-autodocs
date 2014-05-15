
public class PacketClientbound07 extends gx {

   private int a;
   private sv b;
   private alp c;
   private alr d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, sv var2, alr var3, alp var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(ha var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = sv.a(var1.readUnsignedByte());
      this.c = alp.a(var1.readUnsignedByte());
      this.d = alr.a(var1.readString(16));
      if(this.d == null) {
         this.d = alr.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
