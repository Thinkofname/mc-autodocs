
public class PacketClientbound13 extends fr {

   private int[] a;


   public PacketClientbound13() {}

   public PacketClientbound13(int ... var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = new int[var1.readByte()];

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = var1.readInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a.length);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         var1.writeInt(this.a[var2]);
      }

   }

   public void a(ft var1) {
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
