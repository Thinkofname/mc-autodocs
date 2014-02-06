
public class PacketServerbound0B extends gm {

   private int a;
   private kg b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = kg.a(var1.readUnsignedByte());
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(kg.a(this.b));
      var1.writeVarInt(this.c);
   }

   public void a(jk var1) {
      var1.a(this);
   }

   public kg d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
