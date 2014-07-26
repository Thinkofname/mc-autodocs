package net.minecraft.network;

import net.minecraft.network.PacketHandler;
import net.minecraft.network.login.PacketEncryptionRequest;
import net.minecraft.network.login.PacketLoginCompression;
import net.minecraft.network.login.PacketLoginDisconnect;
import net.minecraft.network.login.PacketLoginSuccess;

public interface PacketHandlerLoginClientbound extends PacketHandler {

   void handle(PacketEncryptionRequest var1);

   void handle(PacketLoginSuccess var1);

   void handle(PacketLoginDisconnect var1);

   void handle(PacketLoginCompression var1);
}
