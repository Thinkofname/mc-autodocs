package net.minecraft.network;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public interface Packet {

   void read(PacketByteBuf var1);

   void write(PacketByteBuf var1);

   void handle(PacketHandler var1);
}
