package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketCombatEvent implements Packet {

   public kd a;
   public int b;
   public int c;
   public int d;
   public String e;


   public PacketCombatEvent() {}

   public PacketCombatEvent(wb arg_0, kd arg_1) {
      this.a = arg_1;
      xk var3 = arg_0.c();
      switch(kc.a[arg_1.ordinal()]) {
      case 1:
         this.d = arg_0.f();
         this.c = var3 == null?-1:var3.E();
         break;
      case 2:
         this.b = arg_0.h().E();
         this.c = var3 == null?-1:var3.E();
         this.e = arg_0.b().c();
      }

   }

   public void read(PacketByteBuf in) {
      this.a = (kd)in.readEnum(kd.class);
      if(this.a == kd.b) {
         this.d = in.readVarInt();
         this.c = in.readInt();
      } else if(this.a == kd.c) {
         this.b = in.readVarInt();
         this.c = in.readInt();
         this.e = in.readString(32767);
      }

   }

   public void write(PacketByteBuf out) {
      out.writeEnum(this.a);
      if(this.a == kd.b) {
         out.writeVarInt(this.d);
         out.writeInt(this.c);
      } else if(this.a == kd.c) {
         out.writeVarInt(this.b);
         out.writeInt(this.c);
         out.writeString(this.e);
      }

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
