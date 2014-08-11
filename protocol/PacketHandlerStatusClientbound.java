package net.minecraft.network;

import net.minecraft.network.PacketHandler;
import net.minecraft.network.status.PacketStatusPong;
import net.minecraft.network.status.PacketStatusResponse;

public interface PacketHandlerStatusClientbound extends PacketHandler {

   void handle(PacketStatusResponse var1);

   void handle(PacketStatusPong var1);
}
