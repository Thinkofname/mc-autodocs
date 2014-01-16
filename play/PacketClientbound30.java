import java.util.List;

public class PacketClientbound30 extends ga {

   private int a;
   private adc[] b;


   public PacketClientbound30() {}

   public PacketClientbound30(int var1, List var2) {
      this.a = var1;
      this.b = new adc[var2.size()];

      for(int var3 = 0; var3 < this.b.length; ++var3) {
         adc var4 = (adc)var2.get(var3);
         this.b[var3] = var4 == null?null:var4.m();
      }

   }

   public void read(PacketBuffer var1) {
      this.a = var1.readUnsignedByte();
      short var2 = var1.readShort();
      this.b = new adc[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.b[var3] = var1.readSlot();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a);
      var1.writeShort(this.b.length);
      adc[] var2 = this.b;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         adc var5 = var2[var4];
         var1.writeSlot(var5);
      }

   }

   public void a(gd var1) {
      var1.a(this);
   }
}
