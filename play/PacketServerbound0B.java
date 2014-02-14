
public class PacketServerbound0B extends gs {

   private int a;
   private km b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = km.a(var1.readUnsignedByte());
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(km.a(this.b));
      var1.writeVarInt(this.c);
   }

   public void a(jq var1) {
      var1.a(this);
   }

   public km d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
