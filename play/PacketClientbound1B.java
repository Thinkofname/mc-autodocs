
public class PacketClientbound1B extends gm {

   private int a;
   private int b;
   private int c;


   public PacketClientbound1B() {}

   public PacketClientbound1B(int var1, sd var2, sd var3) {
      this.a = var1;
      this.b = var2.A();
      this.c = var3 != null?var3.A():-1;
   }

   public void read(PacketBuffer var1) {
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.a = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeByte(this.a);
   }

   public void a(gp var1) {
      var1.a(this);
   }
}
