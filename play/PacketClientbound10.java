
public class PacketClientbound10 extends gv {

   private int a;
   private Position b;
   private dq c;
   private String d;


   public PacketClientbound10() {}

   public PacketClientbound10(uu var1) {
      this.a = var1.D();
      this.b = var1.h();
      this.c = var1.b;
      this.d = var1.c.B;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.d = var1.readString(uv.A);
      this.b = var1.readPosition();
      this.c = dq.b(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeString(this.d);
      var1.writePosition(this.b);
      var1.writeByte(this.c.b());
   }

   public void a(gy var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, type=%s, x=%d, y=%d, z=%d, facing=%s", new Object[]{Integer.valueOf(this.a), this.d, Integer.valueOf(this.b.n()), Integer.valueOf(this.b.o()), Integer.valueOf(this.b.p()), this.c});
   }
}
