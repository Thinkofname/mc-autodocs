
public class PacketClientbound33 extends fr {

   private int a;
   private int b;
   private int c;
   private String[] d;


   public PacketClientbound33() {}

   public PacketClientbound33(int var1, int var2, int var3, String[] var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = new String[]{var4[0], var4[1], var4[2], var4[3]};
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readShort();
      this.c = var1.readInt();
      this.d = new String[4];

      for(int var2 = 0; var2 < 4; ++var2) {
         this.d[var2] = var1.readString(15);
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
      var1.writeInt(this.c);

      for(int var2 = 0; var2 < 4; ++var2) {
         var1.writeString(this.d[var2]);
      }

   }

   public void a(ft var1) {
      var1.a(this);
   }
}
