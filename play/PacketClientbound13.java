
public class PacketClientbound13 implements gx {

   private int[] a;


   public PacketClientbound13() {}

   public PacketClientbound13(int ... var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = new int[var1.readVarInt()];

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = var1.readVarInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a.length);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         var1.writeVarInt(this.a[var2]);
      }

   }

   public void a(hc var1) {
      var1.a(this);
   }
}
