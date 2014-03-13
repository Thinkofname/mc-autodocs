
public class PacketClientbound07 extends gt {

   private int a;
   private sg b;
   private akp c;
   private akr d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, sg var2, akr var3, akp var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(gw var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = sg.a(var1.readUnsignedByte());
      this.c = akp.a(var1.readUnsignedByte());
      this.d = akr.a(var1.readString(16));
      if(this.d == null) {
         this.d = akr.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
