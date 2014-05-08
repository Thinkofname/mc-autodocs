import org.apache.commons.lang3.ArrayUtils;

public class PacketClientbound3A extends gv {

   private String[] a;


   public PacketClientbound3A() {}

   public PacketClientbound3A(String[] var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = new String[var1.readVarInt()];

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = var1.readString(32767);
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a.length);
      String[] var2 = this.a;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = var2[var4];
         var1.writeString(var5);
      }

   }

   public void a(gy var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("candidates=\'%s\'", new Object[]{ArrayUtils.toString(this.a)});
   }
}
