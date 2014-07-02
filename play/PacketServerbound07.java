
public class PacketServerbound07 implements hf {

   private Position a;
   private dw b;
   private lk c;


   public void read(PacketBuffer var1) {
      this.c = (lk)var1.readEnum(lk.class);
      this.a = var1.readPosition();
      this.b = dw.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.c);
      var1.writePosition(this.a);
      var1.writeByte(this.b.a());
   }

   public void a(kq var1) {
      var1.a(this);
   }

   public Position a() {
      return this.a;
   }

   public dw b() {
      return this.b;
   }

   public lk c() {
      return this.c;
   }
}
