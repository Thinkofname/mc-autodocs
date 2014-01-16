
public class PacketServerbound10 extends ga {

   private int a;
   private ItemStack b;


   public void a(ix var1) {
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

   public int c() {
      return this.a;
   }

   public ItemStack d() {
      return this.b;
   }
}
