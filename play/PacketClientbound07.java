
public class PacketClientbound07 implements hz {

   private int a;
   private vc b;
   private apu c;
   private apw d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, vc var2, apw var3, apu var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(ig var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = vc.a(var1.readUnsignedByte());
      this.c = apu.a(var1.readUnsignedByte());
      this.d = apw.a(var1.readString(16));
      if(this.d == null) {
         this.d = apw.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
