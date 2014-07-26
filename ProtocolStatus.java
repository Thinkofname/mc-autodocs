package net.minecraft.network;

import net.minecraft.network.ProtocolDirection;
import net.minecraft.network.status.PacketStatusPing;
import net.minecraft.network.status.PacketStatusPong;
import net.minecraft.network.status.PacketStatusRequest;
import net.minecraft.network.status.PacketStatusResponse;

public enum ProtocolStatus {

   public ProtocolStatus(String arg_0, int arg_1, int arg_2) {
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketStatusRequest.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketStatusResponse.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketStatusPing.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketStatusPong.class);
   }
}
