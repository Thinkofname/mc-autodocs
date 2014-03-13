
public class PacketServerbound07 extends gt {

   private Position a;
   private dp b;
   private kl c;


   public void read(PacketBuffer var1) {
      this.c = kl.a(var1.readUnsignedByte());
      this.a = var1.readPosition();
      this.b = dp.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(kl.a(this.c));
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(jr var1) {
      var1.a(this);
   }

   public Position c() {
      return this.a;
   }

   public dp d() {
      return this.b;
   }

   public kl e() {
      return this.c;
   }
}
