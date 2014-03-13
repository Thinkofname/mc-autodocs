import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class PacketClientbound02 extends gt {

   private GameProfile a;


   public PacketClientbound02() {}

   public PacketClientbound02(GameProfile var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      String var2 = var1.readString(36);
      String var3 = var1.readString(16);
      UUID var4 = UUID.fromString(var2);
      this.a = new GameProfile(var4, var3);
   }

   public void write(PacketBuffer var1) {
      UUID var2 = this.a.getId();
      var1.writeString(var2 == null?"":var2.toString());
      var1.writeString(this.a.getName());
   }

   public void a(kw var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
