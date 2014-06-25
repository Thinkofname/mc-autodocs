
public class PacketClientbound07 implements hb {

   private int a;
   private td b;
   private amf c;
   private amh d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, td var2, amh var3, amf var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(hh var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = td.a(var1.readUnsignedByte());
      this.c = amf.a(var1.readUnsignedByte());
      this.d = amh.a(var1.readString(16));
      if(this.d == null) {
         this.d = amh.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
