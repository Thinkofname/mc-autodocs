import java.util.List;

public class PacketClientbound1C extends gx {

   private int a;
   private List b;


   public PacketClientbound1C() {}

   public PacketClientbound1C(int var1, vb var2, boolean var3) {
      this.a = var1;
      if(var3) {
         this.b = var2.c();
      } else {
         this.b = var2.b();
      }

   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = vb.b(var1);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      vb.a(this.b, var1);
   }

   public void a(ha var1) {
      var1.a(this);
   }
}
