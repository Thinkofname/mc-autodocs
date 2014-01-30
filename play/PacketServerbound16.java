
public class PacketServerbound16 extends gj {

   private jl a;


   public PacketServerbound16() {}

   public PacketServerbound16(jl var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = jl.a()[var1.readUnsignedByte() % jl.a().length];
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(jl.a(this.a));
   }

   public void a(jh var1) {
      var1.a(this);
   }

   public jl c() {
      return this.a;
   }
}
