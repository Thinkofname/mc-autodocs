package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketUseEntity implements Packet {

   private int a;
   private mc b;
   private brk c;


   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = (mc)in.readEnum(mc.class);
      if(this.b == mc.c) {
         this.c = new brk((double)in.readFloat(), (double)in.readFloat(), (double)in.readFloat());
      }

   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeEnum(this.b);
      if(this.b == mc.c) {
         out.writeFloat((float)this.c.a);
         out.writeFloat((float)this.c.b);
         out.writeFloat((float)this.c.c);
      }

   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public ws a(aqm arg_0) {
      return arg_0.a(this.a);
   }

   public mc a() {
      return this.b;
   }

   public brk b() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
