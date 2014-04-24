
public class PacketClientbound1D extends gu {

   private int a;
   private byte b;
   private byte c;
   private int d;
   private byte e;


   public PacketClientbound1D() {}

   public PacketClientbound1D(int var1, tl var2) {
      this.a = var1;
      this.b = (byte)(var2.a() & 255);
      this.c = (byte)(var2.c() & 255);
      if(var2.b() > 32767) {
         this.d = 32767;
      } else {
         this.d = var2.b();
      }

      this.e = (byte)(var2.f()?1:0);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readByte();
      this.c = var1.readByte();
      this.d = var1.readVarInt();
      this.e = var1.readByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(this.b);
      var1.writeByte(this.c);
      var1.writeVarInt(this.d);
      var1.writeByte(this.e);
   }

   public void a(gx var1) {
      var1.a(this);
   }
}
