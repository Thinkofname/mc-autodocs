
public class PacketClientbound2B implements gx {

   public static final String[] a = new String[]{"tile.bed.notValid", null, null, "gameMode.changed"};
   private int b;
   private float c;


   public PacketClientbound2B() {}

   public PacketClientbound2B(int var1, float var2) {
      this.b = var1;
      this.c = var2;
   }

   public void read(PacketBuffer var1) {
      this.b = var1.readUnsignedByte();
      this.c = var1.readFloat();
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.b);
      var1.writeFloat(this.c);
   }

   public void a(hc var1) {
      var1.a(this);
   }

}
