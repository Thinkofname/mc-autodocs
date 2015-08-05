package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketServerDifficulty implements Packet {

   private ov a;
   private boolean b;


   public PacketServerDifficulty() {}

   public PacketServerDifficulty(ov arg_0, boolean arg_1) {
      this.a = arg_0;
      this.b = arg_1;
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = ov.a(in.readUnsignedByte());
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeByte(this.a.a());
   }

   public boolean a() {
      return this.b;
   }

   public ov b() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
