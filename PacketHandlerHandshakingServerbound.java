package net.minecraft.network;

import net.minecraft.network.PacketHandler;
import net.minecraft.network.handshaking.PacketHandshake;

public interface PacketHandlerHandshakingServerbound extends PacketHandler {

   void handle(PacketHandshake var1);
}
