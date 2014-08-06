package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketCombatEvent implements Packet {

   public ke a;
   public int b;
   public int c;
   public int d;
   public String e;


   public PacketCombatEvent() {}

   public PacketCombatEvent(wd arg_0, ke arg_1) {
      this.a = arg_1;
      xj var3 = arg_0.c();
      switch(kd.a[arg_1.ordinal()]) {
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
      this.a = (ke)in.readEnum(ke.class);
      if(this.a == ke.b) {
         this.d = in.readVarInt();
         this.c = in.readInt();
      } else if(this.a == ke.c) {
         this.b = in.readVarInt();
         this.c = in.readInt();
         this.e = in.readString(32767);
      }

   }

   public void write(PacketByteBuf out) {
      out.writeEnum(this.a);
      if(this.a == ke.b) {
         out.writeVarInt(this.d);
         out.writeInt(this.c);
      } else if(this.a == ke.c) {
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
