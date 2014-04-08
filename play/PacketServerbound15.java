
public class PacketServerbound15 extends fr {

   private String a;
   private int b;
   private yy c;
   private boolean d;
   private ra e;
   private boolean f;


   public void read(PacketBuffer var1) {
      this.a = var1.readString(7);
      this.b = var1.readByte();
      this.c = yy.a(var1.readByte());
      this.d = var1.readBoolean();
      this.e = ra.a(var1.readByte());
      this.f = var1.readBoolean();
   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeByte(this.b);
      var1.writeByte(this.c.a());
      var1.writeBoolean(this.d);
      var1.writeByte(this.e.a());
      var1.writeBoolean(this.f);
   }

   public void a(im var1) {
      var1.a(this);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public yy e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public ra g() {
      return this.e;
   }

   public boolean h() {
      return this.f;
   }

   public String b() {
      return String.format("lang=\'%s\', view=%d, chat=%s, col=%b, difficulty=%s, cape=%b", new Object[]{this.a, Integer.valueOf(this.b), this.c, Boolean.valueOf(this.d), this.e, Boolean.valueOf(this.f)});
   }
}
