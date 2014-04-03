
public class PacketServerbound0B extends fr {

   private int a;
   private int b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readByte();
      this.c = var1.readInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
      var1.writeInt(this.c);
   }

   public void a(im var1) {
      var1.a(this);
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
