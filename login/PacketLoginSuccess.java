package net.minecraft.network.login;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketLoginSuccess implements Packet {

   private GameProfile a;


   public PacketLoginSuccess() {}

   public PacketLoginSuccess(GameProfile arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) {
      String var2 = in.readString(36);
      String var3 = in.readString(16);
      UUID var4 = UUID.fromString(var2);
      this.a = new GameProfile(var4, var3);
   }

   public void write(PacketByteBuf out) {
      UUID var2 = this.a.getId();
      out.writeString(var2 == null?"":var2.toString());
      out.writeString(this.a.getName());
   }

   public void a(mw arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((mw)arg_0);
   }
}
