package net.minecraft.network.status;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerStatusClientbound;

public class PacketStatusResponse implements Packet {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(ns.class, new nt()).registerTypeAdapter(np.class, new nq()).registerTypeAdapter(no.class, new nr()).registerTypeHierarchyAdapter(IChatMessage.class, new ho()).registerTypeHierarchyAdapter(hu.class, new hw()).registerTypeAdapterFactory(new ur()).create();
   private no b;


   public PacketStatusResponse() {}

   public PacketStatusResponse(no arg_0) {
      this.b = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.b = (no)a.fromJson(in.readString(32767), no.class);
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
