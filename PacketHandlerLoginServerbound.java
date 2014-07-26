package net.minecraft.network;

import net.minecraft.network.PacketHandler;
import net.minecraft.network.login.PacketEncryptionResponse;
import net.minecraft.network.login.PacketLoginStart;

public interface PacketHandlerLoginServerbound extends PacketHandler {

   void handle(PacketLoginStart var1);

   void handle(PacketEncryptionResponse var1);
}
