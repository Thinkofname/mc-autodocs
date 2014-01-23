
public class PacketServerbound0F extends gf {

   private int a;
   private short b;
   private boolean c;


   public void a(jc var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readByte();
      this.b = var1.readShort();
      this.c = var1.readByte() != 0;
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a);
      var1.writeShort(this.b);
      var1.writeByte(this.c?1:0);
   }

   public String b() {
      return String.format("id=%d, uid=%d, accepted=%b", new Object[]{Integer.valueOf(this.a), Short.valueOf(this.b), Boolean.valueOf(this.c)});
   }

   public int c() {
      return this.a;
   }

   public short d() {
      return this.b;
   }
}
