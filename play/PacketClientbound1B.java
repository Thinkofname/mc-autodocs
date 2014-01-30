
public class PacketClientbound1B extends gj {

   private int a;
   private int b;
   private int c;


   public PacketClientbound1B() {}

   public PacketClientbound1B(int var1, rz var2, rz var3) {
      this.a = var1;
      this.b = var2.C();
      this.c = var3 != null?var3.C():-1;
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

   public void a(gm var1) {
      var1.a(this);
   }
}
