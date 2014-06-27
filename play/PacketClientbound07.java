
public class PacketClientbound07 implements hb {

   private int a;
   private te b;
   private amg c;
   private ami d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, te var2, ami var3, amg var4) {
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
      this.b = te.a(var1.readUnsignedByte());
      this.c = amg.a(var1.readUnsignedByte());
      this.d = ami.a(var1.readString(16));
      if(this.d == null) {
         this.d = ami.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
