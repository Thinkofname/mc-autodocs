
public class PacketServerbound00 implements hf {

   private int a;


   public void a(kq var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
   }

   public int a() {
      return this.a;
   }
}
