
public class PacketClientbound45 extends gx {

   private jw a;
   private gl b;
   private int c;
   private int d;
   private int e;


   public PacketClientbound45() {}

   public PacketClientbound45(jw var1, gl var2) {
      this(var1, var2, -1, -1, -1);
   }

   public PacketClientbound45(int var1, int var2, int var3) {
      this(jw.c, (gl)null, var1, var2, var3);
   }

   public PacketClientbound45(jw var1, gl var2, int var3, int var4, int var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public void read(PacketBuffer var1) {
      this.a = jw.a(var1.readByte());
      if(this.a == jw.a || this.a == jw.b) {
         this.b = var1.b();
      }

      if(this.a == jw.c) {
         this.c = var1.readInt();
         this.d = var1.readInt();
         this.e = var1.readInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a.a());
      if(this.a == jw.a || this.a == jw.b) {
         var1.a(this.b);
      }

      if(this.a == jw.c) {
         var1.writeInt(this.c);
         var1.writeInt(this.d);
         var1.writeInt(this.e);
      }

   }

   public void a(ha var1) {
      var1.a(this);
   }
}
