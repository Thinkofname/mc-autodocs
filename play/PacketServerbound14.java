import org.apache.commons.lang3.StringUtils;

public class PacketServerbound14 extends gm {

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

   public void a(jk var1) {
      var1.a(this);
   }

   public String c() {
      return this.a;
   }

   public String b() {
      return String.format("message=\'%s\'", new Object[]{this.a});
   }
}
