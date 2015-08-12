package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;
import net.minecraft.network.enums.EntityAction;

public class PacketEntityAction implements Packet {

   private int a;
   private EntityAction b;
   private int c;


   public PacketEntityAction() {}

   public PacketEntityAction(qq arg_0, EntityAction arg_1) {
      this(arg_0, arg_1, 0);
   }

   public PacketEntityAction(qq arg_0, EntityAction arg_1, int arg_2) {
      this.a = arg_0.F();
      this.b = arg_1;
      this.c = arg_2;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = (EntityAction)in.readEnum(EntityAction.class);
      this.c = in.readVarInt();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeEnum(this.b);
      out.writeVarInt(this.c);
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public EntityAction b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
