import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.Iterator;
import java.util.List;

public class PacketClientbound38 implements ib {

   private kg a;
   private final List b = Lists.newArrayList();


   public PacketClientbound38() {}

   public PacketClientbound38(kg var1, qn ... var2) {
      this.a = var1;
      qn[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         qn var6 = var3[var5];
         this.b.add(new kh(this, var6.bX(), var6.h, var6.c.b(), var6.D()));
      }

   }

   public PacketClientbound38(kg var1, Iterable var2) {
      this.a = var1;
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         qn var4 = (qn)var3.next();
         this.b.add(new kh(this, var4.bX(), var4.h, var4.c.b(), var4.D()));
      }

   }

   public void read(PacketBuffer var1) {
      this.a = (kg)var1.readEnum(kg.class);
      int var2 = var1.readVarInt();

      for(int var3 = 0; var3 < var2; ++var3) {
         GameProfile var4 = null;
         int var5 = 0;
         aqd var6 = null;
         hm var7 = null;
         switch(kf.a[this.a.ordinal()]) {
         case 1:
            var4 = new GameProfile(var1.readUUID(), var1.readString(16));
            int var8 = var1.readVarInt();

            for(int var9 = 0; var9 < var8; ++var9) {
               String var10 = var1.readString(32767);
               String var11 = var1.readString(32767);
               if(var1.readBoolean()) {
                  var4.getProperties().put(var10, new Property(var10, var11, var1.readString(32767)));
               } else {
                  var4.getProperties().put(var10, new Property(var10, var11));
               }
            }

            var6 = aqd.a(var1.readVarInt());
            var5 = var1.readVarInt();
            if(var1.readBoolean()) {
               var7 = var1.d();
            }
            break;
         case 2:
            var4 = new GameProfile(var1.readUUID(), (String)null);
            var6 = aqd.a(var1.readVarInt());
            break;
         case 3:
            var4 = new GameProfile(var1.readUUID(), (String)null);
            var5 = var1.readVarInt();
            break;
         case 4:
            var4 = new GameProfile(var1.readUUID(), (String)null);
            if(var1.readBoolean()) {
               var7 = var1.d();
            }
            break;
         case 5:
            var4 = new GameProfile(var1.readUUID(), (String)null);
         }

         this.b.add(new kh(this, var4, var5, var6, var7));
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.a);
      var1.writeVarInt(this.b.size());
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         kh var3 = (kh)var2.next();
         switch(kf.a[this.a.ordinal()]) {
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
            if(var3.d() == null) {
               var1.writeBoolean(false);
            } else {
               var1.writeBoolean(true);
               var1.a(var3.d());
            }
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
            if(var3.d() == null) {
               var1.writeBoolean(false);
            } else {
               var1.writeBoolean(true);
               var1.a(var3.d());
            }
            break;
         case 5:
            var1.writeUUID(var3.a().getId());
         }
      }

   }

   public void a(ii var1) {
      var1.a(this);
   }
}
