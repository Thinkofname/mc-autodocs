
public class PacketClientbound22 implements ib {

   private apo a;
   private iz[] b;


   public PacketClientbound22() {}

   public PacketClientbound22(int var1, short[] var2, bdy var3) {
      this.a = new apo(var3.a, var3.b);
      this.b = new iz[var1];

      for(int var4 = 0; var4 < this.b.length; ++var4) {
         this.b[var4] = new iz(this, var2[var4], var3);
      }

   }

   public void read(PacketBuffer var1) {
      this.a = new apo(var1.readInt(), var1.readInt());
      this.b = new iz[var1.readVarInt()];

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         this.b[var2] = new iz(this, var1.readShort(), (bct)asq.d.a(var1.readVarInt()));
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a.a);
      var1.writeInt(this.a.b);
      var1.writeVarInt(this.b.length);
      iz[] var2 = this.b;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         iz var5 = var2[var4];
         var1.writeShort(var5.b());
         var1.writeVarInt(asq.d.b(var5.c()));
      }

   }

   public void a(ii var1) {
      var1.a(this);
   }

   // $FF: synthetic method
   static apo a(PacketClientbound22 var0) {
      return var0.a;
   }
}
