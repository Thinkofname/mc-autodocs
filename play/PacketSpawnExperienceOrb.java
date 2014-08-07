package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketSpawnExperienceOrb implements Packet {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;


   public PacketSpawnExperienceOrb() {}

   public PacketSpawnExperienceOrb(xi arg_0) {
      this.a = arg_0.E();
      this.b = ut.c(arg_0.s * 32.0D);
      this.c = ut.c(arg_0.t * 32.0D);
      this.d = ut.c(arg_0.u * 32.0D);
      this.e = arg_0.i();
   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = in.readInt();
      this.c = in.readInt();
      this.d = in.readInt();
      this.e = in.readShort();
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeInt(this.b);
      out.writeInt(this.c);
      out.writeInt(this.d);
      out.writeShort(this.e);
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
