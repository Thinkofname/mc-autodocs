package net.minecraft.network;

import net.minecraft.network.ProtocolDirection;
import net.minecraft.network.login.PacketEncryptionRequest;
import net.minecraft.network.login.PacketEncryptionResponse;
import net.minecraft.network.login.PacketLoginCompression;
import net.minecraft.network.login.PacketLoginDisconnect;
import net.minecraft.network.login.PacketLoginStart;
import net.minecraft.network.login.PacketLoginSuccess;

public enum ProtocolLogin {

   public ProtocolLogin(String arg_0, int arg_1, int arg_2) {
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketLoginDisconnect.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketEncryptionRequest.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketLoginSuccess.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketLoginCompression.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketLoginStart.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketEncryptionResponse.class);
   }
}
