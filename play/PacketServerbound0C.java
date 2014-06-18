
public class PacketServerbound0C implements ha {

   private float a;
   private float b;
   private boolean c;
   private boolean d;


   public void read(PacketBuffer var1) {
      this.a = var1.readFloat();
      this.b = var1.readFloat();
      byte var2 = var1.readByte();
      this.c = (var2 & 1) > 0;
      this.d = (var2 & 2) > 0;
   }

   public void write(PacketBuffer var1) {
      var1.writeFloat(this.a);
      var1.writeFloat(this.b);
      byte var2 = 0;
      if(this.c) {
         var2 = (byte)(var2 | 1);
      }

      if(this.d) {
         var2 = (byte)(var2 | 2);
      }

      var1.writeByte(var2);
   }

   public void a(kk var1) {
      var1.a(this);
   }

   public float a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }
}
