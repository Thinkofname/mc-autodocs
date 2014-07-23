import java.util.UUID;

public class PacketServerbound18 implements ib {

   private UUID a;


   public PacketServerbound18() {}

   public PacketServerbound18(UUID var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readUUID();
   }

   public void write(PacketBuffer var1) {
      var1.writeUUID(this.a);
   }

   public void a(lo var1) {
      var1.a(this);
   }

   public wi a(qk var1) {
      return var1.a(this.a);
   }
}
