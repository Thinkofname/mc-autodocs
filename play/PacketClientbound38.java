import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.Iterator;
import java.util.List;

public class PacketClientbound38 implements hb {

   private je a;
   private final List b = Lists.newArrayList();


   public PacketClientbound38() {}

   public PacketClientbound38(je var1, oy ... var2) {
      this.a = var1;
      oy[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         oy var6 = var3[var5];
         this.b.add(new jf(this, var6.bT(), var6.h, var6.c.b()));
      }

   }

   public PacketClientbound38(je var1, Iterable var2) {
      this.a = var1;
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         oy var4 = (oy)var3.next();
         this.b.add(new jf(this, var4.bT(), var4.h, var4.c.b()));
      }

   }

   public void read(PacketBuffer var1) {
      this.a = (je)var1.readEnum(je.class);
      int var2 = var1.readVarInt();

      for(int var3 = 0; var3 < var2; ++var3) {
         GameProfile var4 = null;
         int var5 = 0;
         amf var6 = null;
         switch(jd.a[this.a.ordinal()]) {
         case 1:
            var4 = new GameProfile(var1.readUUID(), var1.readString(16));
            int var7 = var1.readVarInt();

            for(int var8 = 0; var8 < var7; ++var8) {
               String var9 = var1.readString(32767);
               String var10 = var1.readString(32767);
               if(var1.readBoolean()) {
                  var4.getProperties().put(var9, new Property(var9, var10, var1.readString(32767)));
               } else {
                  var4.getProperties().put(var9, new Property(var9, var10));
               }
            }

            var6 = amf.a(var1.readVarInt());
            var5 = var1.readVarInt();
            break;
         case 2:
            var4 = new GameProfile(var1.readUUID(), (String)null);
            var6 = amf.a(var1.readVarInt());
            break;
         case 3:
            var4 = new GameProfile(var1.readUUID(), (String)null);
            var5 = var1.readVarInt();
            break;
         case 4:
            var4 = new GameProfile(var1.readUUID(), (String)null);
         }

         this.b.add(new jf(this, var4, var5, var6));
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.a);
      var1.writeVarInt(this.b.size());
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         jf var3 = (jf)var2.next();
         switch(jd.a[this.a.ordinal()]) {
         case 1:
            var1.writeUUID(var3.a().getId());
            var1.writeString(var3.a().getName());
            var1.writeVarInt(var3.a().getProperties().size());
            Iterator var4 = var3.a().getProperties().values().iterator();

            while(var4.hasNext()) {
               Property var5 = (Property)var4.next();
               var1.writeString(var5.getName());
               var1.writeString(var5.getValue());
               if(var5.hasSignature()) {
                  var1.writeBoolean(true);
                  var1.writeString(var5.getSignature());
               } else {
                  var1.writeBoolean(false);
               }
            }

            var1.writeVarInt(var3.c().a());
            var1.writeVarInt(var3.b());
            break;
         case 2:
            var1.writeUUID(var3.a().getId());
            var1.writeVarInt(var3.c().a());
            break;
         case 3:
            var1.writeUUID(var3.a().getId());
            var1.writeVarInt(var3.b());
            break;
         case 4:
            var1.writeUUID(var3.a().getId());
         }
      }

   }

   public void a(hh var1) {
      var1.a(this);
   }
}
