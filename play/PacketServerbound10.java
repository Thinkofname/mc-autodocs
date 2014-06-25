
public class PacketServerbound10 implements hb {

   private int a;
   private ItemStack b;


   public void a(kl var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readShort();
      this.b = var1.readSlot();
   }

   public void write(PacketBuffer var1) {
      var1.writeShort(this.a);
      var1.writeSlot(this.b);
   }

   public int a() {
      return this.a;
   }

   public ItemStack b() {
      return this.b;
   }
}
