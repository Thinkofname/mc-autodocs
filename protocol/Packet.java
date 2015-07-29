package net.minecraft.network;

import java.io.IOException;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public interface Packet {

   void read(PacketByteBuf var1) throws IOException;

   void write(PacketByteBuf var1) throws IOException;

   void handle(PacketHandler var1);
}
