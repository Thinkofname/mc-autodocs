
public class PacketServerbound00 implements ha {

   private int a;
   private String b;
   private int c;
   private fx d;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readString(255);
      this.c = var1.readUnsignedShort();
      this.d = fx.a(var1.readVarInt());
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeString(this.b);
      var1.writeShort(this.c);
      var1.writeVarInt(this.d.a());
   }

   public void a(lp var1) {
      var1.a(this);
   }

   public fx a() {
      return this.d;
   }

   public int b() {
      return this.a;
   }
}
