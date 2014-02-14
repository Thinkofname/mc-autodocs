
public class PacketServerbound15 extends gs {

   private String a;
   private int b;
   private aaw c;
   private boolean d;
   private int e;


   public void read(PacketBuffer var1) {
      this.a = var1.readString(7);
      this.b = var1.readByte();
      this.c = aaw.a(var1.readByte());
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

   public void a(jq var1) {
      var1.a(this);
   }

   public String c() {
      return this.a;
   }

   public aaw e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public String b() {
      return String.format("lang=\'%s\', view=%d, chat=%s, col=%b, modelCustomisation=%b", new Object[]{this.a, Integer.valueOf(this.b), this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e)});
   }
}
