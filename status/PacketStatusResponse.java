package net.minecraft.network.status;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerStatusClientbound;

public class PacketStatusResponse implements Packet {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(nr.class, new ns()).registerTypeAdapter(no.class, new np()).registerTypeAdapter(nn.class, new nq()).registerTypeHierarchyAdapter(IChatMessage.class, new hn()).registerTypeHierarchyAdapter(ht.class, new hv()).registerTypeAdapterFactory(new uq()).create();
   private nn b;


   public PacketStatusResponse() {}

   public PacketStatusResponse(nn arg_0) {
      this.b = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.b = (nn)a.fromJson(in.readString(32767), nn.class);
   }

   public void write(PacketByteBuf out) {
      out.writeString(a.toJson(this.b));
   }

   public void handle(PacketHandlerStatusClientbound handler) {
      handler.handle(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerStatusClientbound)handler);
   }

}
