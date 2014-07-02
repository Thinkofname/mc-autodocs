
public class PacketClientbound22 implements hf {

   private ami a;
   private ic[] b;


   public PacketClientbound22() {}

   public PacketClientbound22(int var1, short[] var2, azs var3) {
      this.a = new ami(var3.a, var3.b);
      this.b = new ic[var1];

      for(int var4 = 0; var4 < this.b.length; ++var4) {
         this.b[var4] = new ic(this, var2[var4], var3);
      }

   }

   public void read(PacketBuffer var1) {
      this.a = new ami(var1.readInt(), var1.readInt());
      this.b = new ic[var1.readVarInt()];

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         this.b[var2] = new ic(this, var1.readShort(), (ayu)apa.e.a(var1.readVarInt()));
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a.a);
      var1.writeInt(this.a.b);
      var1.writeVarInt(this.b.length);
      ic[] var2 = this.b;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         ic var5 = var2[var4];
         var1.writeShort(var5.b());
         var1.writeVarInt(apa.e.b(var5.c()));
      }

   }

   public void a(hl var1) {
      var1.a(this);
   }

   // $FF: synthetic method
   static ami a(PacketClientbound22 var0) {
      return var0.a;
   }
}
