package net.minecraft.network.status;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerStatusClientbound;

public class PacketStatusResponse implements Packet {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(nu.class, new nv()).registerTypeAdapter(nr.class, new ns()).registerTypeAdapter(nq.class, new nt()).registerTypeHierarchyAdapter(IChatMessage.class, new hq()).registerTypeHierarchyAdapter(hw.class, new hy()).registerTypeAdapterFactory(new uv()).create();
   private nq b;


   public PacketStatusResponse() {}

   public PacketStatusResponse(nq arg_0) {
      this.b = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.b = (nq)a.fromJson(in.readString(32767), nq.class);
   }

   public void write(PacketByteBuf out) {
      out.writeString(a.toJson(this.b));
   }

   public void handle(PacketHandlerStatusClientbound handler) {
      handler.handle(this);
   }

   public nq a() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerStatusClientbound)handler);
   }

}
