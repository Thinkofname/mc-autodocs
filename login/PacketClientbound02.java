import com.mojang.authlib.GameProfile;

public class PacketClientbound02 extends gk {

   private GameProfile a;


   public PacketClientbound02() {}

   public PacketClientbound02(GameProfile var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      String var2 = var1.readString(36);
      String var3 = var1.readString(16);
      this.a = new GameProfile(var2, var3);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a.getId());
      var1.writeString(this.a.getName());
   }

   public void a(kn var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }
}
