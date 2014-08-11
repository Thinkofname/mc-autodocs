package net.minecraft.network;

import net.minecraft.network.PacketHandler;
import net.minecraft.network.status.PacketStatusPing;
import net.minecraft.network.status.PacketStatusRequest;

public interface PacketHandlerStatusServerbound extends PacketHandler {

   void handle(PacketStatusPing var1);

   void handle(PacketStatusRequest var1);
}
