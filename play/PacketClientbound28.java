
public class PacketClientbound28 extends gt {

   private int a;
   private Position b;
   private int c;
   private boolean d;


   public PacketClientbound28() {}

   public PacketClientbound28(int var1, Position var2, int var3, boolean var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readPosition();
      this.c = var1.readInt();
      this.d = var1.readBoolean();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writePosition(this.b);
      var1.writeInt(this.c);
      var1.writeBoolean(this.d);
   }

   public void a(gw var1) {
      var1.a(this);
   }
}
