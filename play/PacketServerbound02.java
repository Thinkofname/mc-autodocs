
public class PacketServerbound02 extends gu {

   private int a;
   private kh b;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = kh.a()[var1.readUnsignedByte() % kh.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(kh.a(this.b));
   }

   public void a(jv var1) {
      var1.a(this);
   }

   public tp a(aky var1) {
      return var1.a(this.a);
   }

   public kh c() {
      return this.b;
   }
}
