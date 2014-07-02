
public class PacketServerbound0B implements hf {

   private int a;
   private lm b;
   private int c;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = (lm)var1.readEnum(lm.class);
      this.c = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeEnum(this.b);
      var1.writeVarInt(this.c);
   }

   public void a(kq var1) {
      var1.a(this);
   }

   public lm b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
