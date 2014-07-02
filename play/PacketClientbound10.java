
public class PacketClientbound10 implements hf {

   private int a;
   private Position b;
   private dw c;
   private String d;


   public PacketClientbound10() {}

   public PacketClientbound10(vn var1) {
      this.a = var1.D();
      this.b = var1.m();
      this.c = var1.b;
      this.d = var1.c.B;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.d = var1.readString(vo.A);
      this.b = var1.readPosition();
      this.c = dw.b(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeString(this.d);
      var1.writePosition(this.b);
      var1.writeByte(this.c.b());
   }

   public void a(hl var1) {
      var1.a(this);
   }
}
