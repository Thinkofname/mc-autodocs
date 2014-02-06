
public class PacketServerbound0B extends gk {

   private int a;
   private ke b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = ke.a(var1.readUnsignedByte());
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(ke.a(this.b));
      var1.writeVarInt(this.c);
   }

   public void a(ji var1) {
      var1.a(this);
   }

   public ke d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
