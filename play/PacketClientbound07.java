
public class PacketClientbound07 extends gv {

   private int a;
   private sr b;
   private all c;
   private aln d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, sr var2, aln var3, all var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(gy var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = sr.a(var1.readUnsignedByte());
      this.c = all.a(var1.readUnsignedByte());
      this.d = aln.a(var1.readString(16));
      if(this.d == null) {
         this.d = aln.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
