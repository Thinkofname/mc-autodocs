
public class PacketClientbound10 implements hb {

   private int a;
   private Position b;
   private du c;
   private String d;


   public PacketClientbound10() {}

   public PacketClientbound10(ve var1) {
      this.a = var1.D();
      this.b = var1.i();
      this.c = var1.b;
      this.d = var1.c.B;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.d = var1.readString(vf.A);
      this.b = var1.readPosition();
      this.c = du.b(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeString(this.d);
      var1.writePosition(this.b);
      var1.writeByte(this.c.b());
   }

   public void a(hh var1) {
      var1.a(this);
   }
}
