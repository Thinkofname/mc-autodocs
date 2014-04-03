
public class PacketClientbound07 extends fr {

   private int a;
   private qz b;
   private ahg c;
   private ahi d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, qz var2, ahi var3, ahg var4) {
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
      this.b = qz.a(var1.readUnsignedByte());
      this.c = ahg.a(var1.readUnsignedByte());
      this.d = ahi.a(var1.readString(16));
      if(this.d == null) {
         this.d = ahi.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
