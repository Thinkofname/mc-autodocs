
public class PacketClientbound43 extends gs {

   public int a;


   public PacketClientbound43() {}

   public PacketClientbound43(sk var1) {
      this.a = var1.A();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
   }

   public void a(gv var1) {
      var1.a(this);
   }

   public String b() {
      return "cameraId=" + this.a;
   }
}
