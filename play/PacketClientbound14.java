
public class PacketClientbound14 implements hb {

   protected int a;
   protected byte b;
   protected byte c;
   protected byte d;
   protected byte e;
   protected byte f;
   protected boolean g;
   protected boolean h;


   public PacketClientbound14() {}

   public PacketClientbound14(int var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
   }

   public void a(hh var1) {
      var1.a(this);
   }

   public String toString() {
      return "Entity_" + super.toString();
   }
}
