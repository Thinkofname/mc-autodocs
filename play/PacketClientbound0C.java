import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileProperty;
import java.util.Iterator;
import java.util.List;

public class PacketClientbound0C extends gf {

   private int a;
   private GameProfile b;
   private int c;
   private int d;
   private int e;
   private byte f;
   private byte g;
   private int h;
   private ta i;
   private List j;


   public PacketClientbound0C() {}

   public PacketClientbound0C(zh var1) {
      this.a = var1.A();
      this.b = var1.bK();
      this.c = py.c(var1.s * 32.0D);
      this.d = py.c(var1.t * 32.0D);
      this.e = py.c(var1.u * 32.0D);
      this.f = (byte)((int)(var1.y * 256.0F / 360.0F));
      this.g = (byte)((int)(var1.z * 256.0F / 360.0F));
      ItemStack var2 = var1.bm.j();
      this.h = var2 == null?0:adm.b(var2.b());
      this.i = var1.C();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = new GameProfile(var1.readString(36), var1.readString(16));
      int var2 = var1.readVarInt();

      for(int var3 = 0; var3 < var2; ++var3) {
         String var4 = var1.readString(32767);
         String var5 = var1.readString(32767);
         String var6 = var1.readString(32767);
         this.b.getProperties().put(var4, new ProfileProperty(var4, var5, var6));
      }

      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readByte();
      this.g = var1.readByte();
      this.h = var1.readShort();
      this.j = ta.b(var1);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeString(this.b.getId());
      var1.writeString(this.b.getName());
      var1.writeVarInt(this.b.getProperties().size());
      Iterator var2 = this.b.getProperties().values().iterator();

      while(var2.hasNext()) {
         ProfileProperty var3 = (ProfileProperty)var2.next();
         var1.writeString(var3.getName());
         var1.writeString(var3.getValue());
         var1.writeString(var3.getSignature());
      }

      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
      var1.writeShort(this.h);
      this.i.a(var1);
   }

   public void a(gi var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, gameProfile=\'%s\', x=%.2f, y=%.2f, z=%.2f, carried=%d", new Object[]{Integer.valueOf(this.a), this.b, Float.valueOf((float)this.c / 32.0F), Float.valueOf((float)this.d / 32.0F), Float.valueOf((float)this.e / 32.0F), Integer.valueOf(this.h)});
   }
}
