import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class PacketServerbound00 extends gv {

   private GameProfile a;


   public PacketServerbound00() {}

   public PacketServerbound00(GameProfile var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = new GameProfile((UUID)null, var1.readString(16));
   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a.getName());
   }

   public void a(lj var1) {
      var1.a(this);
   }

   public GameProfile c() {
      return this.a;
   }
}
