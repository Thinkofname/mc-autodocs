
public class PacketServerbound08 extends gs {

   private static final Position a = new Position(-1, -1, -1);
   private Position b;
   private int c;
   private ItemStack d;
   private float e;
   private float f;
   private float g;


   public PacketServerbound08() {}

   public PacketServerbound08(ItemStack var1) {
      this(a, 255, var1, 0.0F, 0.0F, 0.0F);
   }

   public PacketServerbound08(Position var1, int var2, ItemStack var3, float var4, float var5, float var6) {
      this.b = var1;
      this.c = var2;
      this.d = var3 != null?var3.m():null;
      this.e = var4;
      this.f = var5;
      this.g = var6;
   }

   public void read(PacketBuffer var1) {
      this.b = var1.readPosition();
      this.c = var1.readUnsignedByte();
      this.d = var1.readSlot();
      this.e = (float)var1.readUnsignedByte() / 16.0F;
      this.f = (float)var1.readUnsignedByte() / 16.0F;
      this.g = (float)var1.readUnsignedByte() / 16.0F;
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.b);
      var1.writeByte(this.c);
      var1.writeSlot(this.d);
      var1.writeByte((int)(this.e * 16.0F));
      var1.writeByte((int)(this.f * 16.0F));
      var1.writeByte((int)(this.g * 16.0F));
   }

   public void a(jq var1) {
      var1.a(this);
   }

   public Position c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public ItemStack e() {
      return this.d;
   }

   public float f() {
      return this.e;
   }

   public float g() {
      return this.f;
   }

   public float h() {
      return this.g;
   }

}
