import org.apache.commons.lang3.StringUtils;

public class PacketServerbound14 implements hf {

   private String a;


   public PacketServerbound14() {}

   public PacketServerbound14(String var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(32767);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(StringUtils.substring(this.a, 0, 32767));
   }

   public void a(kq var1) {
      var1.a(this);
   }

   public String a() {
      return this.a;
   }
}
