
public class PacketServerbound0B extends gv {

   private int a;
   private kv b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = kv.a(var1.readUnsignedByte());
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(kv.a(this.b));
      var1.writeVarInt(this.c);
   }

   public void a(jz var1) {
      var1.a(this);
   }

   public kv d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
