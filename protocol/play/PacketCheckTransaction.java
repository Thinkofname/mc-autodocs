package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketCheckTransaction implements Packet {

   private int a;
   private short b;
   private boolean c;


   public PacketCheckTransaction() {}

   public PacketCheckTransaction(int arg_0, short arg_1, boolean arg_2) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readByte();
      this.b = in.readShort();
      this.c = in.readByte() != 0;
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeByte(this.a);
      out.writeShort(this.b);
      out.writeByte(this.c?1:0);
   }

   public int a() {
      return this.a;
   }

   public short b() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
