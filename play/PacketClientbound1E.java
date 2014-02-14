
public class PacketClientbound1E extends gs {

   private int a;
   private int b;


   public PacketClientbound1E() {}

   public PacketClientbound1E(int var1, sg var2) {
      this.a = var1;
      this.b = var2.a();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(gv var1) {
      var1.a(this);
   }
}
