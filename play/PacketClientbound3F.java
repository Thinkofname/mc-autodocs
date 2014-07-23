import java.io.IOException;

public class PacketClientbound3F implements ib {

   private String a;
   private byte[] b;


   public PacketClientbound3F() {}

   public PacketClientbound3F(String var1, PacketBuffer var2) {
      this(var1, var2.b());
   }

   public PacketClientbound3F(String var1, byte[] var2) {
      this.a = var1;
      this.b = var2;
      if(var2.length > 1048576) {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(20);
      int var2 = var1.readVarInt();
      if(var2 >= 0 && var2 <= 1048576) {
         this.b = new byte[var2];
         var1.readBytes(this.b);
      } else {
         throw new IOException("Payload may not be larger than 1048576 bytes");
      }
   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeVarInt(this.b.length);
      var1.writeBytes(this.b);
   }

   public void a(ii var1) {
      var1.a(this);
   }
}
