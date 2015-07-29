package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;
import net.minecraft.network.enums.InteractType;
import net.minecraft.network.enums.PlayerHand;

public class PacketUseEntity implements Packet {

   private int a;
   private InteractType b;
   private awh c;
   private PlayerHand d;


   public PacketUseEntity() {}

   public PacketUseEntity(pr arg_0) {
      this.a = arg_0.F();
      this.b = InteractType.ATTACK;
   }

   public PacketUseEntity(pr arg_0, PlayerHand arg_1) {
      this.a = arg_0.F();
      this.b = InteractType.INTERACT;
      this.d = arg_1;
   }

   public PacketUseEntity(pr arg_0, PlayerHand arg_1, awh arg_2) {
      this.a = arg_0.F();
      this.b = InteractType.INTERACT_AT;
      this.d = arg_1;
      this.c = arg_2;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = (InteractType)in.readEnum(InteractType.class);
      if(this.b == InteractType.INTERACT_AT) {
         this.c = new awh((double)in.readFloat(), (double)in.readFloat(), (double)in.readFloat());
      }

      if(this.b == InteractType.INTERACT || this.b == InteractType.INTERACT_AT) {
         this.d = (PlayerHand)in.readEnum(PlayerHand.class);
      }

   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeEnum(this.b);
      if(this.b == InteractType.INTERACT_AT) {
         out.writeFloat((float)this.c.a);
         out.writeFloat((float)this.c.b);
         out.writeFloat((float)this.c.c);
      }

      if(this.b == InteractType.INTERACT || this.b == InteractType.INTERACT_AT) {
         out.writeEnum(this.d);
      }

   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public pr a(aen arg_0) {
      return arg_0.a(this.a);
   }

   public InteractType a() {
      return this.b;
   }

   public PlayerHand b() {
      return this.d;
   }

   public awh c() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
