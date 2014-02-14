
public class PacketServerbound07 extends gs {

   private Position a;
   private dp b;
   private kk c;


   public void read(PacketBuffer var1) {
      this.c = kk.a(var1.readUnsignedByte());
      this.a = var1.readPosition();
      this.b = dp.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(kk.a(this.c));
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(jq var1) {
      var1.a(this);
   }

   public Position c() {
      return this.a;
   }

   public dp d() {
      return this.b;
   }

   public kk e() {
      return this.c;
   }
}
