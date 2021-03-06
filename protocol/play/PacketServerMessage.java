package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketServerMessage implements Packet {

   private IChatMessage a;
   private byte b;


   public PacketServerMessage() {}

   public PacketServerMessage(IChatMessage arg_0) {
      this(arg_0, (byte)1);
   }

   public PacketServerMessage(IChatMessage arg_0, byte arg_1) {
      this.a = arg_0;
      this.b = arg_1;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readChat();
      this.b = in.readByte();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeChat(this.a);
      out.writeByte(this.b);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public IChatMessage a() {
      return this.a;
   }

   public boolean b() {
      return this.b == 1 || this.b == 2;
   }

   public byte c() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
