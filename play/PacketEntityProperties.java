package net.minecraft.network.play;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketEntityProperties implements Packet {

   private int a;
   private final List b = Lists.newArrayList();


   public PacketEntityProperties() {}

   public PacketEntityProperties(int arg_0, Collection arg_1) {
      this.a = arg_0;
      Iterator var3 = arg_1.iterator();

      while(var3.hasNext()) {
         xv var4 = (xv)var3.next();
         this.b.add(new lm(this, var4.a().a(), var4.b(), var4.c()));
      }

   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      int var2 = in.readInt();

      for(int var3 = 0; var3 < var2; ++var3) {
         String var4 = in.readString(64);
         double var5 = in.readDouble();
         ArrayList var7 = Lists.newArrayList();
         int var8 = in.readVarInt();

         for(int var9 = 0; var9 < var8; ++var9) {
            UUID var10 = in.readUUID();
            var7.add(new xw(var10, "Unknown synced attribute modifier", in.readDouble(), in.readByte()));
         }

         this.b.add(new lm(this, var4, var5, var7));
      }

   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeInt(this.b.size());
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         lm var3 = (lm)var2.next();
         out.writeString(var3.a());
         out.writeDouble(var3.b());
         out.writeVarInt(var3.c().size());
         Iterator var4 = var3.c().iterator();

         while(var4.hasNext()) {
            xw var5 = (xw)var4.next();
            out.writeUUID(var5.a());
            out.writeDouble(var5.d());
            out.writeByte(var5.c());
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
