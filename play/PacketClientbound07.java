
public class PacketClientbound07 extends ft {

   private int a;
   private rc b;
   private ahj c;
   private ahl d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, rc var2, ahl var3, ahj var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = rc.a(var1.readUnsignedByte());
      this.c = ahj.a(var1.readUnsignedByte());
      this.d = ahl.a(var1.readString(16));
      if(this.d == null) {
         this.d = ahl.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
