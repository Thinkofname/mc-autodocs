package net.minecraft.network.status;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerStatusClientbound;

public class PacketStatusResponse implements Packet {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(nt.class, new nu()).registerTypeAdapter(nq.class, new nr()).registerTypeAdapter(np.class, new ns()).registerTypeHierarchyAdapter(IChatMessage.class, new hp()).registerTypeHierarchyAdapter(hv.class, new hx()).registerTypeAdapterFactory(new ut()).create();
   private np b;


   public PacketStatusResponse() {}

   public PacketStatusResponse(np arg_0) {
      this.b = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.b = (np)a.fromJson(in.readString(32767), np.class);
   }

   public void write(PacketByteBuf out) {
      out.writeString(a.toJson(this.b));
   }

   public void handle(PacketHandlerStatusClientbound handler) {
      handler.handle(this);
   }

   public np a() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerStatusClientbound)handler);
   }

}
