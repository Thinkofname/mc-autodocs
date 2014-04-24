
public class PacketServerbound16 extends gu {

   private jz a;


   public PacketServerbound16() {}

   public PacketServerbound16(jz var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = jz.a()[var1.readUnsignedByte() % jz.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(jz.a(this.a));
   }

   public void a(jv var1) {
      var1.a(this);
   }

   public jz c() {
      return this.a;
   }
}
