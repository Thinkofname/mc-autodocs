import com.mojang.authlib.GameProfile;
import java.util.List;

public class PacketClientbound0C extends ga {

   private int a;
   private GameProfile b;
   private int c;
   private int d;
   private int e;
   private byte f;
   private byte g;
   private int h;
   private sr i;
   private List j;


   public PacketClientbound0C() {}

   public PacketClientbound0C(yv var1) {
      this.a = var1.x();
      this.b = var1.bJ();
      this.c = pp.c(var1.s * 32.0D);
      this.d = pp.c(var1.t * 32.0D);
      this.e = pp.c(var1.u * 32.0D);
      this.f = (byte)((int)(var1.y * 256.0F / 360.0F));
      this.g = (byte)((int)(var1.z * 256.0F / 360.0F));
      ItemStack var2 = var1.bm.j();
      this.h = var2 == null?0:ada.b(var2.b());
      this.i = var1.z();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = new GameProfile(var1.readString(36), var1.readString(16));
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readByte();
      this.g = var1.readByte();
      this.h = var1.readShort();
      this.j = sr.b(var1);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeString(this.b.getId());
      var1.writeString(this.b.getName());
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
      var1.writeShort(this.h);
      this.i.a(var1);
   }

   public void a(gd var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, gameProfile=\'%s\', x=%.2f, y=%.2f, z=%.2f, carried=%d", new Object[]{Integer.valueOf(this.a), this.b, Float.valueOf((float)this.c / 32.0F), Float.valueOf((float)this.d / 32.0F), Float.valueOf((float)this.e / 32.0F), Integer.valueOf(this.h)});
   }
}
