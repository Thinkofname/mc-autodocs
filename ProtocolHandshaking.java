package net.minecraft.network;

import net.minecraft.network.ProtocolDirection;
import net.minecraft.network.handshaking.PacketHandshake;

public enum ProtocolHandshaking {

   public ProtocolHandshaking(String arg_0, int arg_1, int arg_2) {
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketHandshake.class);
   }
}
