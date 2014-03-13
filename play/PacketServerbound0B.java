
public class PacketServerbound0B extends gt {

   private int a;
   private kn b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = kn.a(var1.readUnsignedByte());
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(kn.a(this.b));
      var1.writeVarInt(this.c);
   }

   public void a(jr var1) {
      var1.a(this);
   }

   public kn d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
