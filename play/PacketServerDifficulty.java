package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketServerDifficulty implements Packet {

   private vi a;
   private boolean b;


   public PacketServerDifficulty() {}

   public PacketServerDifficulty(vi arg_0, boolean arg_1) {
      this.a = arg_0;
      this.b = arg_1;
   }

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   public void read(PacketByteBuf in) {
      this.a = vi.a(in.readUnsignedByte());
   }

   public void write(PacketByteBuf out) {
      out.writeByte(this.a.a());
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}
