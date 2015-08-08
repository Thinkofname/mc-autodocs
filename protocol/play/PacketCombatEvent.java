package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.chat.IChatMessage;
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
   public IChatMessage e;


   public PacketCombatEvent() {}

   public PacketCombatEvent(pq arg_0, CombatEvent arg_1) {
      this.a = arg_1;
      qp var3 = arg_0.c();
      switch(gy$1.a[arg_1.ordinal()]) {
      case 1:
         this.d = arg_0.f();
         this.c = var3 == null?-1:var3.F();
         break;
      case 2:
         this.b = arg_0.h().F();
         this.c = var3 == null?-1:var3.F();
         this.e = arg_0.b();
      }

   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = (CombatEvent)in.readEnum(CombatEvent.class);
      if(this.a == CombatEvent.END_COMBAT) {
         this.d = in.readVarInt();
         this.c = in.readInt();
      } else if(this.a == CombatEvent.ENTITY_DIED) {
         this.b = in.readVarInt();
         this.c = in.readInt();
         this.e = in.readChat();
      }

   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeEnum(this.a);
      if(this.a == CombatEvent.END_COMBAT) {
         out.writeVarInt(this.d);
         out.writeInt(this.c);
      } else if(this.a == CombatEvent.ENTITY_DIED) {
         out.writeVarInt(this.b);
         out.writeInt(this.c);
         out.writeChat(this.e);
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
