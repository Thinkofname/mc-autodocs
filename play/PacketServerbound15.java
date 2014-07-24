
public class PacketServerbound15 implements ib {

   private String a;
   private int b;
   private agq c;
   private boolean d;
   private int e;


   public void read(PacketBuffer var1) {
      this.a = var1.readString(7);
      this.b = var1.readByte();
      this.c = agq.a(var1.readByte());
      this.d = var1.readBoolean();
      this.e = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeByte(this.b);
      var1.writeByte(this.c.a());
      var1.writeBoolean(this.d);
      var1.writeByte(this.e);
   }

   public void a(lo var1) {
      var1.a(this);
   }

   public String a() {
      return this.a;
   }

   public agq c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }
}
