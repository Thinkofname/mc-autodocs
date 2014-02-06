
public class PacketServerbound00 extends gm {

   private int a;


   public void a(jk var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
   }

   public boolean a() {
      return true;
   }

   public int c() {
      return this.a;
   }
}
