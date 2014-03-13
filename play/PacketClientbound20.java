import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class PacketClientbound20 extends gt {

   private int a;
   private final List b = Lists.newArrayList();


   public PacketClientbound20() {}

   public PacketClientbound20(int var1, Collection var2) {
      this.a = var1;
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         uq var4 = (uq)var3.next();
         this.b.add(new jp(this, var4.a().a(), var4.b(), var4.c()));
      }

   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      int var2 = var1.readInt();

      for(int var3 = 0; var3 < var2; ++var3) {
         String var4 = var1.readString(64);
         double var5 = var1.readDouble();
         ArrayList var7 = Lists.newArrayList();
         int var8 = var1.readVarInt();

         for(int var9 = 0; var9 < var8; ++var9) {
            UUID var10 = var1.d();
            var7.add(new ur(var10, "Unknown synced attribute modifier", var1.readDouble(), var1.readByte()));
         }

         this.b.add(new jp(this, var4, var5, var7));
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeInt(this.b.size());
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         jp var3 = (jp)var2.next();
         var1.writeString(var3.a());
         var1.writeDouble(var3.b());
         var1.writeVarInt(var3.c().size());
         Iterator var4 = var3.c().iterator();

         while(var4.hasNext()) {
            ur var5 = (ur)var4.next();
            var1.a(var5.a());
            var1.writeDouble(var5.d());
            var1.writeByte(var5.c());
         }
      }

   }

   public void a(gw var1) {
      var1.a(this);
   }
}
