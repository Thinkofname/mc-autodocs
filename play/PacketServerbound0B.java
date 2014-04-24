
public class PacketServerbound0B extends gu {

   private int a;
   private kr b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = kr.a(var1.readUnsignedByte());
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(kr.a(this.b));
      var1.writeVarInt(this.c);
   }

   public void a(jv var1) {
      var1.a(this);
   }

   public kr d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
