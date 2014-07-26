package net.minecraft.network.play;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.Iterator;
import java.util.List;
import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketPlayerListItem implements Packet {

   private kg a;
   private final List b = Lists.newArrayList();


   public PacketPlayerListItem() {}

   public PacketPlayerListItem(kg arg_0, qo ... arg_1) {
      this.a = arg_0;
      qo[] var3 = arg_1;
      int var4 = arg_1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         qo var6 = var3[var5];
         this.b.add(new kh(this, var6.bX(), var6.h, var6.c.b(), var6.D()));
      }

   }

   public PacketPlayerListItem(kg arg_0, Iterable arg_1) {
      this.a = arg_0;
      Iterator var3 = arg_1.iterator();

      while(var3.hasNext()) {
         qo var4 = (qo)var3.next();
         this.b.add(new kh(this, var4.bX(), var4.h, var4.c.b(), var4.D()));
      }

   }

   public void read(PacketByteBuf in) {
      this.a = (kg)in.readEnum(kg.class);
      int var2 = in.readVarInt();

      for(int var3 = 0; var3 < var2; ++var3) {
         GameProfile var4 = null;
         int var5 = 0;
         aqi var6 = null;
         IChatMessage var7 = null;
         switch(kf.a[this.a.ordinal()]) {
         case 1:
            var4 = new GameProfile(in.readUUID(), in.readString(16));
            int var8 = in.readVarInt();

            for(int var9 = 0; var9 < var8; ++var9) {
               String var10 = in.readString(32767);
               String var11 = in.readString(32767);
               if(in.readBoolean()) {
                  var4.getProperties().put(var10, new Property(var10, var11, in.readString(32767)));
               } else {
                  var4.getProperties().put(var10, new Property(var10, var11));
               }
            }

            var6 = aqi.a(in.readVarInt());
            var5 = in.readVarInt();
            if(in.readBoolean()) {
               var7 = in.readChat();
            }
            break;
         case 2:
            var4 = new GameProfile(in.readUUID(), (String)null);
            var6 = aqi.a(in.readVarInt());
            break;
         case 3:
            var4 = new GameProfile(in.readUUID(), (String)null);
            var5 = in.readVarInt();
            break;
         case 4:
            var4 = new GameProfile(in.readUUID(), (String)null);
            if(in.readBoolean()) {
               var7 = in.readChat();
            }
            break;
         case 5:
            var4 = new GameProfile(in.readUUID(), (String)null);
         }

         this.b.add(new kh(this, var4, var5, var6, var7));
      }

   }

   public void write(PacketByteBuf out) {
      out.writeEnum(this.a);
      out.writeVarInt(this.b.size());
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         kh var3 = (kh)var2.next();
         switch(kf.a[this.a.ordinal()]) {
         case 1:
            out.writeUUID(var3.a().getId());
            out.writeString(var3.a().getName());
            out.writeVarInt(var3.a().getProperties().size());
            Iterator var4 = var3.a().getProperties().values().iterator();

            while(var4.hasNext()) {
               Property var5 = (Property)var4.next();
               out.writeString(var5.getName());
               out.writeString(var5.getValue());
               if(var5.hasSignature()) {
                  out.writeBoolean(true);
                  out.writeString(var5.getSignature());
               } else {
                  out.writeBoolean(false);
               }
            }

            out.writeVarInt(var3.c().a());
            out.writeVarInt(var3.b());
            if(var3.d() == null) {
               out.writeBoolean(false);
            } else {
               out.writeBoolean(true);
               out.writeChat(var3.d());
            }
            break;
         case 2:
            out.writeUUID(var3.a().getId());
            out.writeVarInt(var3.c().a());
            break;
         case 3:
            out.writeUUID(var3.a().getId());
            out.writeVarInt(var3.b());
            break;
         case 4:
            out.writeUUID(var3.a().getId());
            if(var3.d() == null) {
               out.writeBoolean(false);
            } else {
               out.writeBoolean(true);
               out.writeChat(var3.d());
            }
            break;
         case 5:
            out.writeUUID(var3.a().getId());
         }
      }

   }

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}
