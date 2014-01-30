
public class PacketServerbound0B extends gj {

   private int a;
   private kd b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = kd.a(var1.readUnsignedByte());
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(kd.a(this.b));
      var1.writeVarInt(this.c);
   }

   public void a(jh var1) {
      var1.a(this);
   }

   public kd d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
