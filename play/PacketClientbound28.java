
public class PacketClientbound28 extends ft {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private boolean f;


   public PacketClientbound28() {}

   public PacketClientbound28(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      this.a = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.b = var5;
      this.f = var6;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readByte() & 255;
      this.e = var1.readInt();
      this.b = var1.readInt();
      this.f = var1.readBoolean();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.c);
      var1.writeByte(this.d & 255);
      var1.writeInt(this.e);
      var1.writeInt(this.b);
      var1.writeBoolean(this.f);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
