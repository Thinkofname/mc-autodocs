
public class PacketClientbound07 implements hf {

   private int a;
   private tm b;
   private amx c;
   private amz d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, tm var2, amz var3, amx var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(hl var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = tm.a(var1.readUnsignedByte());
      this.c = amx.a(var1.readUnsignedByte());
      this.d = amz.a(var1.readString(16));
      if(this.d == null) {
         this.d = amz.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
