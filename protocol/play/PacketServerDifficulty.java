package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketServerDifficulty implements Packet {

   private vr a;
   private boolean b;


   public PacketServerDifficulty() {}

   public PacketServerDifficulty(vr arg_0, boolean arg_1) {
      this.a = arg_0;
      this.b = arg_1;
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) {
      this.a = vr.a(in.readUnsignedByte());
   }

   public void write(PacketByteBuf out) {
      out.writeByte(this.a.a());
   }

   public boolean a() {
      return this.b;
   }

   public vr b() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
