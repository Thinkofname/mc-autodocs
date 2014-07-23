
public class PacketClientbound2A implements ib {

   private ev a;
   private float b;
   private float c;
   private float d;
   private float e;
   private float f;
   private float g;
   private float h;
   private int i;
   private boolean j;
   private int[] k;


   public PacketClientbound2A() {}

   public PacketClientbound2A(ev var1, boolean var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int ... var11) {
      this.a = var1;
      this.j = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
      this.f = var7;
      this.g = var8;
      this.h = var9;
      this.i = var10;
      this.k = var11;
   }

   public void read(PacketBuffer var1) {
      this.a = ev.a(var1.readInt());
      if(this.a == null) {
         this.a = ev.J;
      }

      this.j = var1.readBoolean();
      this.b = var1.readFloat();
      this.c = var1.readFloat();
      this.d = var1.readFloat();
      this.e = var1.readFloat();
      this.f = var1.readFloat();
      this.g = var1.readFloat();
      this.h = var1.readFloat();
      this.i = var1.readInt();
      int var2 = this.a.d();
      this.k = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.k[var3] = var1.readVarInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a.c());
      var1.writeBoolean(this.j);
      var1.writeFloat(this.b);
      var1.writeFloat(this.c);
      var1.writeFloat(this.d);
      var1.writeFloat(this.e);
      var1.writeFloat(this.f);
      var1.writeFloat(this.g);
      var1.writeFloat(this.h);
      var1.writeInt(this.i);
      int var2 = this.a.d();

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.writeVarInt(this.k[var3]);
      }

   }

   public void a(ii var1) {
      var1.a(this);
   }
}
