
public class PacketClientbound3D implements hz {

   private int a;
   private String b;


   public PacketClientbound3D() {}

   public PacketClientbound3D(int var1, bqb var2) {
      this.a = var1;
      if(var2 == null) {
         this.b = "";
      } else {
         this.b = var2.b();
      }

   }

   public void read(PacketBuffer var1) {
      this.a = var1.readByte();
      this.b = var1.readString(16);
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a);
      var1.writeString(this.b);
   }

   public void a(ig var1) {
      var1.a(this);
   }
}
