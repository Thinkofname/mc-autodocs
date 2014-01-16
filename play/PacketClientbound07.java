
public class PacketClientbound07 extends ga {

   private int a;
   private qj b;
   private ahk c;
   private ahm d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, qj var2, ahm var3, ahk var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(gd var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = qj.a(var1.readUnsignedByte());
      this.c = ahk.a(var1.readUnsignedByte());
      this.d = ahm.a(var1.readString(16));
      if(this.d == null) {
         this.d = ahm.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
