package net.minecraft.network.status;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketStatusResponse implements Packet {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(nn.class, new no()).registerTypeAdapter(nk.class, new nl()).registerTypeAdapter(nj.class, new nm()).registerTypeHierarchyAdapter(IChatMessage.class, new hn()).registerTypeHierarchyAdapter(ht.class, new hv()).registerTypeAdapterFactory(new ui()).create();
   private nj b;


   public PacketStatusResponse() {}

   public PacketStatusResponse(nj arg_0) {
      this.b = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.b = (nj)a.fromJson(in.readString(32767), nj.class);
   }

   public void write(PacketByteBuf out) {
      out.writeString(a.toJson(this.b));
   }

   public void a(ng arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ng)arg_0);
   }

}
