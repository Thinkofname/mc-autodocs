
public class PacketServerbound0E extends gs {

   private int a;
   private int b;
   private int c;
   private short d;
   private ItemStack e;
   private int f;


   public void a(jq var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readByte();
      this.b = var1.readShort();
      this.c = var1.readByte();
      this.d = var1.readShort();
      this.f = var1.readByte();
      this.e = var1.readSlot();
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a);
      var1.writeShort(this.b);
      var1.writeByte(this.c);
      var1.writeShort(this.d);
      var1.writeByte(this.f);
      var1.writeSlot(this.e);
   }

   public String b() {
      return this.e != null?String.format("id=%d, slot=%d, button=%d, type=%d, itemid=%d, itemcount=%d, itemaux=%d", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.f), Integer.valueOf(afv.b(this.e.b())), Integer.valueOf(this.e.b), Integer.valueOf(this.e.k())}):String.format("id=%d, slot=%d, button=%d, type=%d, itemid=-1", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.f)});
   }

   public int c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public short f() {
      return this.d;
   }

   public ItemStack g() {
      return this.e;
   }

   public int h() {
      return this.f;
   }
}
