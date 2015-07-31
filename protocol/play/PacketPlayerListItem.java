package net.minecraft.network.play;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;
import net.minecraft.network.enums.ListItemAction;

public class PacketPlayerListItem implements Packet {

   private ListItemAction a;
   private final List b = Lists.newArrayList();


   public PacketPlayerListItem() {}

   public PacketPlayerListItem(ListItemAction arg_0, lh ... arg_1) {
      this.a = arg_0;
      lh[] var3 = arg_1;
      int var4 = arg_1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         lh var6 = var3[var5];
         this.b.add(new gz$b(this, var6.cf(), var6.h, var6.c.b(), var6.E()));
      }

   }

   public PacketPlayerListItem(ListItemAction arg_0, Iterable arg_1) {
      this.a = arg_0;
      Iterator var3 = arg_1.iterator();

      while(var3.hasNext()) {
         lh var4 = (lh)var3.next();
         this.b.add(new gz$b(this, var4.cf(), var4.h, var4.c.b(), var4.E()));
      }

   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = (ListItemAction)in.readEnum(ListItemAction.class);
      int var2 = in.readVarInt();

      for(int var3 = 0; var3 < var2; ++var3) {
         GameProfile var4 = null;
         int var5 = 0;
         aer$a var6 = null;
         IChatMessage var7 = null;
         switch(gz$1.a[this.a.ordinal()]) {
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

            var6 = aer$a.a(in.readVarInt());
            var5 = in.readVarInt();
            if(in.readBoolean()) {
               var7 = in.readChat();
            }
            break;
         case 2:
            var4 = new GameProfile(in.readUUID(), (String)null);
            var6 = aer$a.a(in.readVarInt());
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

         this.b.add(new gz$b(this, var4, var5, var6, var7));
      }

   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeEnum(this.a);
      out.writeVarInt(this.b.size());
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         gz$b var3 = (gz$b)var2.next();
         switch(gz$1.a[this.a.ordinal()]) {
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

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public List a() {
      return this.b;
   }

   public ListItemAction b() {
      return this.a;
   }

   public String toString() {
      return Objects.toStringHelper(this).add("action", this.a).add("entries", this.b).toString();
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
