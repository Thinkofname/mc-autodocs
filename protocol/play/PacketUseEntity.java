package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;
import net.minecraft.network.enums.InteractType;

public class PacketUseEntity implements Packet {

   private int a;
   private InteractType b;
   private bru c;


   public PacketUseEntity() {}

   public PacketUseEntity(wv arg_0, InteractType arg_1) {
      this.a = arg_0.F();
      this.b = arg_1;
   }

   public PacketUseEntity(wv arg_0, bru arg_1) {
      this(arg_0, InteractType.INTERACT_AT);
      this.c = arg_1;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = (InteractType)in.readEnum(InteractType.class);
      if(this.b == InteractType.INTERACT_AT) {
         this.c = new bru((double)in.readFloat(), (double)in.readFloat(), (double)in.readFloat());
      }

   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeEnum(this.b);
      if(this.b == InteractType.INTERACT_AT) {
         out.writeFloat((float)this.c.a);
         out.writeFloat((float)this.c.b);
         out.writeFloat((float)this.c.c);
      }

   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public wv a(aqs arg_0) {
      return arg_0.a(this.a);
   }

   public InteractType a() {
      return this.b;
   }

   public bru b() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
