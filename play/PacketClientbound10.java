
public class PacketClientbound10 extends gj {

   private int a;
   private Position b;
   private dg c;
   private String d;


   public PacketClientbound10() {}

   public PacketClientbound10(td var1) {
      this.a = var1.C();
      this.b = var1.i();
      this.c = var1.b;
      this.d = var1.c.B;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.d = var1.readString(te.A);
      this.b = var1.readPosition();
      this.c = dg.b(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeString(this.d);
      var1.writePosition(this.b);
      var1.writeByte(this.c.b());
   }

   public void a(gm var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, type=%s, x=%d, y=%d, z=%d, facing=%s", new Object[]{Integer.valueOf(this.a), this.d, Integer.valueOf(this.b.n()), Integer.valueOf(this.b.o()), Integer.valueOf(this.b.p()), this.c});
   }
}
