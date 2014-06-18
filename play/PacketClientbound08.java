import java.util.Set;

public class PacketClientbound08 implements ha {

   private double a;
   private double b;
   private double c;
   private float d;
   private float e;
   private Set f;


   public PacketClientbound08() {}

   public PacketClientbound08(double var1, double var3, double var5, float var7, float var8, Set var9) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
      this.e = var8;
      this.f = var9;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readDouble();
      this.b = var1.readDouble();
      this.c = var1.readDouble();
      this.d = var1.readFloat();
      this.e = var1.readFloat();
      this.f = hf.a(var1.readUnsignedByte());
   }

   public void write(PacketBuffer var1) {
      var1.writeDouble(this.a);
      var1.writeDouble(this.b);
      var1.writeDouble(this.c);
      var1.writeFloat(this.d);
      var1.writeFloat(this.e);
      var1.writeByte(hf.a(this.f));
   }

   public void a(hg var1) {
      var1.a(this);
   }
}
