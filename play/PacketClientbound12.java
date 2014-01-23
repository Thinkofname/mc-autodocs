
public class PacketClientbound12 extends gf {

   private int a;
   private int b;
   private int c;
   private int d;


   public PacketClientbound12() {}

   public PacketClientbound12(ru var1) {
      this(var1.A(), var1.v, var1.w, var1.x);
   }

   public PacketClientbound12(int var1, double var2, double var4, double var6) {
      this.a = var1;
      double var8 = 3.9D;
      if(var2 < -var8) {
         var2 = -var8;
      }

      if(var4 < -var8) {
         var4 = -var8;
      }

      if(var6 < -var8) {
         var6 = -var8;
      }

      if(var2 > var8) {
         var2 = var8;
      }

      if(var4 > var8) {
         var4 = var8;
      }

      if(var6 > var8) {
         var6 = var8;
      }

      this.b = (int)(var2 * 8000.0D);
      this.c = (int)(var4 * 8000.0D);
      this.d = (int)(var6 * 8000.0D);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readShort();
      this.c = var1.readShort();
      this.d = var1.readShort();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeShort(this.b);
      var1.writeShort(this.c);
      var1.writeShort(this.d);
   }

   public void a(gi var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, x=%.2f, y=%.2f, z=%.2f", new Object[]{Integer.valueOf(this.a), Float.valueOf((float)this.b / 8000.0F), Float.valueOf((float)this.c / 8000.0F), Float.valueOf((float)this.d / 8000.0F)});
   }
}
