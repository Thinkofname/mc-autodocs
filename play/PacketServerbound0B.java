
public class PacketServerbound0B extends gf {

   private int a;
   private jy b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = jy.a(var1.readUnsignedByte());
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(jy.a(this.b));
      var1.writeVarInt(this.c);
   }

   public void a(jc var1) {
      var1.a(this);
   }

   public jy d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
