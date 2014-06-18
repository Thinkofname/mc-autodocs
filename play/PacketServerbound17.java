
public class PacketServerbound17 implements ha {

   private String a;
   private int b;
   private byte[] c;


   public void read(PacketBuffer var1) {
      this.a = var1.readString(20);
      this.b = var1.readShort();
      if(this.b > 0 && this.b < 32767) {
         this.c = new byte[this.b];
         var1.readBytes(this.c);
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeShort((short)this.b);
      if(this.c != null) {
         var1.writeBytes(this.c);
      }

   }

   public void a(kk var1) {
      var1.a(this);
   }

   public String a() {
      return this.a;
   }

   public byte[] c() {
      return this.c;
   }
}
