
public class PacketClientbound07 extends gm {

   private int a;
   private ra b;
   private ajb c;
   private ajd d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, ra var2, ajd var3, ajb var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(gp var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = ra.a(var1.readUnsignedByte());
      this.c = ajb.a(var1.readUnsignedByte());
      this.d = ajd.a(var1.readString(16));
      if(this.d == null) {
         this.d = ajd.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
