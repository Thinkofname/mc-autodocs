
public class PacketClientbound2D extends gm {

   private int a;
   private String b;
   private gc c;
   private int d;
   private int e;


   public PacketClientbound2D() {}

   public PacketClientbound2D(int var1, String var2, gc var3) {
      this(var1, var2, var3, 0);
   }

   public PacketClientbound2D(int var1, String var2, gc var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public PacketClientbound2D(int var1, String var2, gc var3, int var4, int var5) {
      this(var1, var2, var3, var4);
      this.e = var5;
   }

   public void a(gp var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readUnsignedByte();
      this.b = var1.readString(32);
      this.c = gd.a(var1.readString(32767));
      this.d = var1.readUnsignedByte();
      if(this.b.equals("EntityHorse")) {
         this.e = var1.readInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a);
      var1.writeString(this.b);
      var1.writeString(gd.a(this.c));
      var1.writeByte(this.d);
      if(this.b.equals("EntityHorse")) {
         var1.writeInt(this.e);
      }

   }
}
