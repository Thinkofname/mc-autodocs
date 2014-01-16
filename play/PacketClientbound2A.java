
public class PacketClientbound2A extends ga {

   private String a;
   private float b;
   private float c;
   private float d;
   private float e;
   private float f;
   private float g;
   private float h;
   private int i;


   public PacketClientbound2A() {}

   public PacketClientbound2A(String var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.i = var9;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(64);
      this.b = var1.readFloat();
      this.c = var1.readFloat();
      this.d = var1.readFloat();
      this.e = var1.readFloat();
      this.f = var1.readFloat();
      this.g = var1.readFloat();
      this.h = var1.readFloat();
      this.i = var1.readInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeFloat(this.b);
      var1.writeFloat(this.c);
      var1.writeFloat(this.d);
      var1.writeFloat(this.e);
      var1.writeFloat(this.f);
      var1.writeFloat(this.g);
      var1.writeFloat(this.h);
      var1.writeInt(this.i);
   }

   public void a(gd var1) {
      var1.a(this);
   }
}
