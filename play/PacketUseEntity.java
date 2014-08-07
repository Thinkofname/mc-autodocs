package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketUseEntity implements Packet {

   private int a;
   private md b;
   private brn c;


   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = (md)in.readEnum(md.class);
      if(this.b == md.c) {
         this.c = new brn((double)in.readFloat(), (double)in.readFloat(), (double)in.readFloat());
      }

   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeEnum(this.b);
      if(this.b == md.c) {
         out.writeFloat((float)this.c.a);
         out.writeFloat((float)this.c.b);
         out.writeFloat((float)this.c.c);
      }

   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public wt a(aqn arg_0) {
      return arg_0.a(this.a);
   }

   public md a() {
      return this.b;
   }

   public brn b() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
