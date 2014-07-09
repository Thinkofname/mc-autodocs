
public class PacketClientbound45 implements hz {

   private le a;
   private hk b;
   private int c;
   private int d;
   private int e;


   public PacketClientbound45() {}

   public PacketClientbound45(le var1, hk var2) {
      this(var1, var2, -1, -1, -1);
   }

   public PacketClientbound45(int var1, int var2, int var3) {
      this(le.c, (hk)null, var1, var2, var3);
   }

   public PacketClientbound45(le var1, hk var2, int var3, int var4, int var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public void read(PacketBuffer var1) {
      this.a = (le)var1.readEnum(le.class);
      if(this.a == le.a || this.a == le.b) {
         this.b = var1.d();
      }

      if(this.a == le.c) {
         this.c = var1.readInt();
         this.d = var1.readInt();
         this.e = var1.readInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.a);
      if(this.a == le.a || this.a == le.b) {
         var1.a(this.b);
      }

      if(this.a == le.c) {
         var1.writeInt(this.c);
         var1.writeInt(this.d);
         var1.writeInt(this.e);
      }

   }

   public void a(ig var1) {
      var1.a(this);
   }
}
