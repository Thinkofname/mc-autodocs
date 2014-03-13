
public class PacketClientbound13 extends gt {

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

   public void a(gw var1) {
      var1.a(this);
   }

   public String b() {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if(var2 > 0) {
            var1.append(", ");
         }

         var1.append(this.a[var2]);
      }

      return String.format("entities=%d[%s]", new Object[]{Integer.valueOf(this.a.length), var1});
   }
}
