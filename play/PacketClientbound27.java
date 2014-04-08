import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PacketClientbound27 extends fr {

   private double a;
   private double b;
   private double c;
   private float d;
   private List e;
   private float f;
   private float g;
   private float h;


   public PacketClientbound27() {}

   public PacketClientbound27(double var1, double var3, double var5, float var7, List var8, azt var9) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
      this.e = new ArrayList(var8);
      if(var9 != null) {
         this.f = (float)var9.a;
         this.g = (float)var9.b;
         this.h = (float)var9.c;
      }

   }

   public void read(PacketBuffer var1) {
      this.a = (double)var1.readFloat();
      this.b = (double)var1.readFloat();
      this.c = (double)var1.readFloat();
      this.d = var1.readFloat();
      int var2 = var1.readInt();
      this.e = new ArrayList(var2);
      int var3 = (int)this.a;
      int var4 = (int)this.b;
      int var5 = (int)this.c;

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7 = var1.readByte() + var3;
         int var8 = var1.readByte() + var4;
         int var9 = var1.readByte() + var5;
         this.e.add(new agq(var7, var8, var9));
      }

      this.f = var1.readFloat();
      this.g = var1.readFloat();
      this.h = var1.readFloat();
   }

   public void write(PacketBuffer var1) {
      var1.writeFloat((float)this.a);
      var1.writeFloat((float)this.b);
      var1.writeFloat((float)this.c);
      var1.writeFloat(this.d);
      var1.writeInt(this.e.size());
      int var2 = (int)this.a;
      int var3 = (int)this.b;
      int var4 = (int)this.c;
      Iterator var5 = this.e.iterator();

      while(var5.hasNext()) {
         agq var6 = (agq)var5.next();
         int var7 = var6.a - var2;
         int var8 = var6.b - var3;
         int var9 = var6.c - var4;
         var1.writeByte(var7);
         var1.writeByte(var8);
         var1.writeByte(var9);
      }

      var1.writeFloat(this.f);
      var1.writeFloat(this.g);
      var1.writeFloat(this.h);
   }

   public void a(ft var1) {
      var1.a(this);
   }
}
