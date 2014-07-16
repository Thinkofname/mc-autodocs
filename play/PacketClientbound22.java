
public class PacketClientbound22 implements hz {

   private aph a;
   private ix[] b;


   public PacketClientbound22() {}

   public PacketClientbound22(int var1, short[] var2, bdl var3) {
      this.a = new aph(var3.a, var3.b);
      this.b = new ix[var1];

      for(int var4 = 0; var4 < this.b.length; ++var4) {
         this.b[var4] = new ix(this, var2[var4], var3);
      }

   }

   public void read(PacketBuffer var1) {
      this.a = new aph(var1.readInt(), var1.readInt());
      this.b = new ix[var1.readVarInt()];

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         this.b[var2] = new ix(this, var1.readShort(), (bcg)asf.d.a(var1.readVarInt()));
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a.a);
      var1.writeInt(this.a.b);
      var1.writeVarInt(this.b.length);
      ix[] var2 = this.b;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         ix var5 = var2[var4];
         var1.writeShort(var5.b());
         var1.writeVarInt(asf.d.b(var5.c()));
      }

   }

   public void a(ig var1) {
      var1.a(this);
   }

   // $FF: synthetic method
   static aph a(PacketClientbound22 var0) {
      return var0.a;
   }
}
