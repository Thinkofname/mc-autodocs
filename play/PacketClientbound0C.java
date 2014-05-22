import java.util.List;
import java.util.UUID;

public class PacketClientbound0C implements gx {

   private int a;
   private UUID b;
   private int c;
   private int d;
   private int e;
   private byte f;
   private byte g;
   private int h;
   private ve i;
   private List j;


   public PacketClientbound0C() {}

   public PacketClientbound0C(aco var1) {
      this.a = var1.D();
      this.b = var1.bS().getId();
      this.c = sd.c(var1.s * 32.0D);
      this.d = sd.c(var1.t * 32.0D);
      this.e = sd.c(var1.u * 32.0D);
      this.f = (byte)((int)(var1.y * 256.0F / 360.0F));
      this.g = (byte)((int)(var1.z * 256.0F / 360.0F));
      ItemStack var2 = var1.bg.h();
      this.h = var2 == null?0:agu.b(var2.b());
      this.i = var1.F();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readUUID();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readByte();
      this.g = var1.readByte();
      this.h = var1.readShort();
      this.j = ve.b(var1);
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeUUID(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
      var1.writeShort(this.h);
      this.i.a(var1);
   }

   public void a(hc var1) {
      var1.a(this);
   }
}
