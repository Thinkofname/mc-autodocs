
public class PacketClientbound1F extends ft {

   private float a;
   private int b;
   private int c;


   public PacketClientbound1F() {}

   public PacketClientbound1F(float var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readFloat();
      this.c = var1.readShort();
      this.b = var1.readShort();
   }

   public void write(PacketBuffer var1) {
      var1.writeFloat(this.a);
      var1.writeShort(this.c);
      var1.writeShort(this.b);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
