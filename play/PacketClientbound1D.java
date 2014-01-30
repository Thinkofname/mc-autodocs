
public class PacketClientbound1D extends gj {

   private int a;
   private byte b;
   private byte c;
   private int d;


   public PacketClientbound1D() {}

   public PacketClientbound1D(int var1, rv var2) {
      this.a = var1;
      this.b = (byte)(var2.a() & 255);
      this.c = (byte)(var2.c() & 255);
      if(var2.b() > 32767) {
         this.d = 32767;
      } else {
         this.d = var2.b();
      }

   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readByte();
      this.c = var1.readByte();
      this.d = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(this.b);
      var1.writeByte(this.c);
      var1.writeVarInt(this.d);
   }

   public void a(gm var1) {
      var1.a(this);
   }
}
