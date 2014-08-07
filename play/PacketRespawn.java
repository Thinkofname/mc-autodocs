package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketRespawn implements Packet {

   private int a;
   private vr b;
   private aqv c;
   private aqx d;


   public PacketRespawn() {}

   public PacketRespawn(int arg_0, vr arg_1, aqx arg_2, aqv arg_3) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_3;
      this.d = arg_2;
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readInt();
      this.b = vr.a(in.readUnsignedByte());
      this.c = aqv.a(in.readUnsignedByte());
      this.d = aqx.a(in.readString(16));
      if(this.d == null) {
         this.d = aqx.b;
      }

   }

   public void write(PacketByteBuf out) {
      out.writeInt(this.a);
      out.writeByte(this.b.a());
      out.writeByte(this.c.a());
      out.writeString(this.d.a());
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
