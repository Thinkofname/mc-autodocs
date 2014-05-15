import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class PacketClientbound38 extends gx {

   private ix a;
   private List b = Lists.newArrayList();


   public PacketClientbound38() {}

   public PacketClientbound38(ix var1, oq ... var2) {
      this.a = var1;
      oq[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         oq var6 = var3[var5];
         this.b.add(new iy(this, var6.aE(), var6.b_(), var6.h, var6.c.b()));
      }

   }

   public void read(PacketBuffer var1) {
      this.a = ix.a()[var1.readVarInt()];
      int var2 = var1.readVarInt();

      for(int var3 = 0; var3 < var2; ++var3) {
         UUID var4 = var1.readUUID();
         String var5 = null;
         int var6 = 0;
         alp var7 = null;
         switch(iw.a[this.a.ordinal()]) {
         case 1:
            var5 = var1.readString(16);
            var7 = alp.a(var1.readVarInt());
            var6 = var1.readVarInt();
            break;
         case 2:
            var7 = alp.a(var1.readVarInt());
            break;
         case 3:
            var6 = var1.readVarInt();
         }

         this.b.add(new iy(this, var4, var5, var6, var7));
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(ix.a(this.a));
      var1.writeVarInt(this.b.size());
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         iy var3 = (iy)var2.next();
         var1.writeUUID(var3.a());
         switch(iw.a[this.a.ordinal()]) {
         case 1:
            var1.writeString(var3.b());
            var1.writeVarInt(var3.d().a());
            var1.writeVarInt(var3.c());
            break;
         case 2:
            var1.writeVarInt(var3.d().a());
            break;
         case 3:
            var1.writeVarInt(var3.c());
         }
      }

   }

   public void a(ha var1) {
      var1.a(this);
   }
}
