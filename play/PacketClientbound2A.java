
public class PacketClientbound2A implements ha {

   private ed a;
   private float b;
   private float c;
   private float d;
   private float e;
   private float f;
   private float g;
   private float h;
   private int i;
   private int[] j;


   public PacketClientbound2A() {}

   public PacketClientbound2A(ed var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int ... var10) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.i = var9;
      this.j = var10;
   }

   public void read(PacketBuffer var1) {
      this.a = ed.a(var1.readInt());
      if(this.a == null) {
         this.a = ed.J;
      }

      this.b = var1.readFloat();
      this.c = var1.readFloat();
      this.d = var1.readFloat();
      this.e = var1.readFloat();
      this.f = var1.readFloat();
      this.g = var1.readFloat();
      this.h = var1.readFloat();
      this.i = var1.readInt();
      int var2 = this.a.d();
      this.j = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.j[var3] = var1.readVarInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a.c());
      var1.writeFloat(this.b);
      var1.writeFloat(this.c);
      var1.writeFloat(this.d);
      var1.writeFloat(this.e);
      var1.writeFloat(this.f);
      var1.writeFloat(this.g);
      var1.writeFloat(this.h);
      var1.writeInt(this.i);
      int[] var2 = this.j;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var2[var4];
         var1.writeVarInt(var5);
      }

   }

   public void a(hg var1) {
      var1.a(this);
   }
}
