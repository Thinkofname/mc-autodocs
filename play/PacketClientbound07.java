
public class PacketClientbound07 extends gs {

   private int a;
   private rh b;
   private aji c;
   private ajk d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, rh var2, ajk var3, aji var4) {
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
      this.b = rh.a(var1.readUnsignedByte());
      this.c = aji.a(var1.readUnsignedByte());
      this.d = ajk.a(var1.readString(16));
      if(this.d == null) {
         this.d = ajk.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
