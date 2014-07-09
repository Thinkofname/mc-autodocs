
public class PacketClientbound46 implements hz {

   private int a;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
   }

   public void a(ig var1) {
      var1.a(this);
   }
}
