
public class PacketClientbound2F extends gv {

   private int a;
   private int b;
   private ItemStack c;


   public PacketClientbound2F() {}

   public PacketClientbound2F(int var1, int var2, ItemStack var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3 == null?null:var3.m();
   }

   public void a(gy var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readByte();
      this.b = var1.readShort();
      this.c = var1.readSlot();
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a);
      var1.writeShort(this.b);
      var1.writeSlot(this.c);
   }
}
