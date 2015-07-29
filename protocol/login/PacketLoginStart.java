package net.minecraft.network.login;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerLoginServerbound;

public class PacketLoginStart implements Packet {

   private GameProfile a;


   public PacketLoginStart() {}

   public PacketLoginStart(GameProfile arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = new GameProfile((UUID)null, in.readString(16));
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeString(this.a.getName());
   }

   public void handle(PacketHandlerLoginServerbound handler) {
      handler.handle(this);
   }

   public GameProfile a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerLoginServerbound)handler);
   }
}
