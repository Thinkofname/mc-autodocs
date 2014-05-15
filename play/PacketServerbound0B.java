
public class PacketServerbound0B extends gx {

   private int a;
   private kz b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = kz.a(var1.readUnsignedByte());
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(kz.a(this.b));
      var1.writeVarInt(this.c);
   }

   public void a(kd var1) {
      var1.a(this);
   }

   public kz d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
