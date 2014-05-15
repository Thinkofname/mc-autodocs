import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class PacketClientbound0C extends gx {

   private int a;
   private GameProfile b;
   private int c;
   private int d;
   private int e;
   private byte f;
   private byte g;
   private int h;
   private vb i;
   private List j;


   public PacketClientbound0C() {}

   public PacketClientbound0C(acl var1) {
      this.a = var1.D();
      this.b = var1.bQ();
      this.c = sb.c(var1.s * 32.0D);
      this.d = sb.c(var1.t * 32.0D);
      this.e = sb.c(var1.u * 32.0D);
      this.f = (byte)((int)(var1.y * 256.0F / 360.0F));
      this.g = (byte)((int)(var1.z * 256.0F / 360.0F));
      ItemStack var2 = var1.bg.h();
      this.h = var2 == null?0:agr.b(var2.b());
      this.i = var1.F();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      UUID var2 = UUID.fromString(var1.readString(36));
      this.b = new GameProfile(var2, var1.readString(16));
      int var3 = var1.readVarInt();

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = var1.readString(32767);
         String var6 = var1.readString(32767);
         String var7 = var1.readString(32767);
         this.b.getProperties().put(var5, new Property(var5, var6, var7));
      }

      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readByte();
      this.g = var1.readByte();
      this.h = var1.readShort();
      this.j = vb.b(var1);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      UUID var2 = this.b.getId();
      var1.writeString(var2 == null?"":var2.toString());
      var1.writeString(this.b.getName());
      var1.writeVarInt(this.b.getProperties().size());
      Iterator var3 = this.b.getProperties().values().iterator();

      while(var3.hasNext()) {
         Property var4 = (Property)var3.next();
         var1.writeString(var4.getName());
         var1.writeString(var4.getValue());
         var1.writeString(var4.getSignature() == null?"":var4.getSignature());
      }

      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
      var1.writeShort(this.h);
      this.i.a(var1);
   }

   public void a(ha var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, gameProfile=\'%s\', x=%.2f, y=%.2f, z=%.2f, carried=%d", new Object[]{Integer.valueOf(this.a), this.b, Float.valueOf((float)this.c / 32.0F), Float.valueOf((float)this.d / 32.0F), Float.valueOf((float)this.e / 32.0F), Integer.valueOf(this.h)});
   }
}
