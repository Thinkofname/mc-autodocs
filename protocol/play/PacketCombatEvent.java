package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;
import net.minecraft.network.enums.CombatEvent;

public class PacketCombatEvent implements Packet {

   public CombatEvent a;
   public int b;
   public int c;
   public int d;
   public String e;


   public PacketCombatEvent() {}

   public PacketCombatEvent(wf arg_0, CombatEvent arg_1) {
      this.a = arg_1;
      xl var3 = arg_0.c();
      switch(ke.a[arg_1.ordinal()]) {
      case 1:
         this.d = arg_0.f();
         this.c = var3 == null?-1:var3.F();
         break;
      case 2:
         this.b = arg_0.h().F();
         this.c = var3 == null?-1:var3.F();
         this.e = arg_0.b().c();
      }

   }

   public void read(PacketByteBuf in) {
      this.a = (CombatEvent)in.readEnum(CombatEvent.class);
      if(this.a == CombatEvent.END_COMBAT) {
         this.d = in.readVarInt();
         this.c = in.readInt();
      } else if(this.a == CombatEvent.ENTITY_DIED) {
         this.b = in.readVarInt();
         this.c = in.readInt();
         this.e = in.readString(32767);
      }

   }

   public void write(PacketByteBuf out) {
      out.writeEnum(this.a);
      if(this.a == CombatEvent.END_COMBAT) {
         out.writeVarInt(this.d);
         out.writeInt(this.c);
      } else if(this.a == CombatEvent.ENTITY_DIED) {
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
