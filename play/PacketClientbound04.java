
public class PacketClientbound04 extends gv {

   private int a;
   private int b;
   private ItemStack c;


   public PacketClientbound04() {}

   public PacketClientbound04(int var1, int var2, ItemStack var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3 == null?null:var3.m();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readShort();
      this.c = var1.readSlot();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeShort(this.b);
      var1.writeSlot(this.c);
   }

   public void a(gy var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("entity=%d, slot=%d, item=%s", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c});
   }
}
