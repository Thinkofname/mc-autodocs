package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketEntityStatus implements Packet {

   private int a;
   private byte b;


   public PacketEntityStatus() {}

   public PacketEntityStatus(qv arg_0, byte arg_1) {
      this.a = arg_0.F();
      this.b = arg_1;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readInt();
      this.b = in.readByte();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeInt(this.a);
      out.writeByte(this.b);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public qv a(agk arg_0) {
      return arg_0.a(this.a);
   }

   public byte a() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
