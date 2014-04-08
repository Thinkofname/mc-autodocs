
public class PacketClientbound07 extends fr {

   private int a;
   private ra b;
   private ahh c;
   private ahj d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, ra var2, ahj var3, ahh var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(ft var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = ra.a(var1.readUnsignedByte());
      this.c = ahh.a(var1.readUnsignedByte());
      this.d = ahj.a(var1.readString(16));
      if(this.d == null) {
         this.d = ahj.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
