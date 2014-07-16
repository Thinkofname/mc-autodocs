import java.io.IOException;

public class PacketServerbound17 implements hz {

   private String a;
   private byte[] b;


   public void read(PacketBuffer var1) {
      this.a = var1.readString(20);
      int var2 = var1.readVarInt();
      if(var2 >= 0 && var2 <= 32767) {
         this.b = new byte[var2];
         var1.readBytes(this.b);
      } else {
         throw new IOException("Payload may not be larger than 32767 bytes");
      }
   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeVarInt(this.b.length);
      var1.writeBytes(this.b);
   }

   public void a(lm var1) {
      var1.a(this);
   }

   public String a() {
      return this.a;
   }

   public byte[] b() {
      return this.b;
   }
}
