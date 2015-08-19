package net.minecraft.network.status;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerStatusClientbound;

public class PacketStatusResponse implements Packet {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(jt$c.class, new jt$c$a()).registerTypeAdapter(jt$a.class, new jt$a$a()).registerTypeAdapter(jt.class, new jt$b()).registerTypeHierarchyAdapter(IChatMessage.class, new eu$a()).registerTypeHierarchyAdapter(ez.class, new ez$a()).registerTypeAdapterFactory(new nx()).create();
   private jt b;


   public PacketStatusResponse() {}

   public PacketStatusResponse(jt arg_0) {
      this.b = arg_0;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.b = (jt)no.a(a, in.readString(32767), jt.class);
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeString(a.toJson(this.b));
   }

   public void handle(PacketHandlerStatusClientbound handler) {
      handler.handle(this);
   }

   public jt a() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerStatusClientbound)handler);
   }

}
