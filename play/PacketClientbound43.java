
public class PacketClientbound43 extends gx {

   public int a;


   public PacketClientbound43() {}

   public PacketClientbound43(ty var1) {
      this.a = var1.D();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
   }

   public void a(ha var1) {
      var1.a(this);
   }

   public String b() {
      return "cameraId=" + this.a;
   }
}
