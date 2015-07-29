package net.minecraft.network.play;

import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketStatistics implements Packet {

   private Map a;


   public PacketStatistics() {}

   public PacketStatistics(Map arg_0) {
      this.a = arg_0;
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) throws IOException {
      int var2 = in.readVarInt();
      this.a = Maps.newHashMap();

      for(int var3 = 0; var3 < var2; ++var3) {
         my var4 = nc.a(in.readString(32767));
         int var5 = in.readVarInt();
         if(var4 != null) {
            this.a.put(var4, Integer.valueOf(var5));
         }
      }

   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a.size());
      Iterator var2 = this.a.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         out.writeString(((my)var3.getKey()).e);
         out.writeVarInt(((Integer)var3.getValue()).intValue());
      }

   }

   public Map a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
