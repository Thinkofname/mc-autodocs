
public class PacketClientbound07 extends gs {

   private int a;
   private se b;
   private akf c;
   private akh d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, se var2, akh var3, akf var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(gv var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = se.a(var1.readUnsignedByte());
      this.c = akf.a(var1.readUnsignedByte());
      this.d = akh.a(var1.readString(16));
      if(this.d == null) {
         this.d = akh.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
