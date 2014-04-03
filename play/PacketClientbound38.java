
public class PacketClientbound38 extends fr {

   private String a;
   private boolean b;
   private int c;


   public PacketClientbound38() {}

   public PacketClientbound38(String var1, boolean var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(16);
      this.b = var1.readBoolean();
      this.c = var1.readShort();
   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeBoolean(this.b);
      var1.writeShort(this.c);
   }

   public void a(ft var1) {
      var1.a(this);
   }
}
