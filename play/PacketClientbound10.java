
public class PacketClientbound10 extends ft {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private String f;


   public PacketClientbound10() {}

   public PacketClientbound10(ta var1) {
      this.a = var1.x();
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.a;
      this.f = var1.e.B;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.f = var1.readString(tb.A);
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeString(this.f);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, type=%s, x=%d, y=%d, z=%d", new Object[]{Integer.valueOf(this.a), this.f, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
   }
}
