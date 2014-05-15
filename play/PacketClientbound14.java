
public class PacketClientbound14 extends gx {

   protected int a;
   protected byte b;
   protected byte c;
   protected byte d;
   protected byte e;
   protected byte f;
   protected boolean g;


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

   public void a(ha var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d", new Object[]{Integer.valueOf(this.a)});
   }

   public String toString() {
      return "Entity_" + super.toString();
   }
}
