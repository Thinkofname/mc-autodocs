package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketSpawnGlobalEntity implements Packet {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;


   public PacketSpawnGlobalEntity() {}

   public PacketSpawnGlobalEntity(ws arg_0) {
      this.a = arg_0.E();
      this.b = us.c(arg_0.s * 32.0D);
      this.c = us.c(arg_0.t * 32.0D);
      this.d = us.c(arg_0.u * 32.0D);
      if(arg_0 instanceof adk) {
         this.e = 1;
      }

   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.e = in.readByte();
      this.b = in.readInt();
      this.c = in.readInt();
      this.d = in.readInt();
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeByte(this.e);
      out.writeInt(this.b);
      out.writeInt(this.c);
      out.writeInt(this.d);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
