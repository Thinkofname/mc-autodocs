
public class PacketClientbound43 extends gt {

   public int a;


   public PacketClientbound43() {}

   public PacketClientbound43(tj var1) {
      this.a = var1.B();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
   }

   public void a(gw var1) {
      var1.a(this);
   }

   public String b() {
      return "cameraId=" + this.a;
   }
}
