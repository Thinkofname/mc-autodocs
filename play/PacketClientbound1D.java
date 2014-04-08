
public class PacketClientbound1D extends fr {

   private int a;
   private byte b;
   private byte c;
   private short d;


   public PacketClientbound1D() {}

   public PacketClientbound1D(int var1, rt var2) {
      this.a = var1;
      this.b = (byte)(var2.a() & 255);
      this.c = (byte)(var2.c() & 255);
      if(var2.b() > 32767) {
         this.d = 32767;
      } else {
         this.d = (short)var2.b();
      }

   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readByte();
      this.c = var1.readByte();
      this.d = var1.readShort();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
      var1.writeByte(this.c);
      var1.writeShort(this.d);
   }

   public void a(ft var1) {
      var1.a(this);
   }
}
