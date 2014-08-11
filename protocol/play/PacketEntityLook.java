package net.minecraft.network.play;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;
import net.minecraft.network.play.PacketEntity;

public class PacketEntityLook extends PacketEntity {

   public PacketEntityLook() {
      this.h = true;
   }

   public PacketEntityLook(int arg_0, byte arg_1, byte arg_2, boolean arg_3) {
      super(arg_0);
      this.e = arg_1;
      this.f = arg_2;
      this.h = true;
      this.g = arg_3;
   }

   public void read(PacketByteBuf in) {
      super.read(in);
      this.e = in.readByte();
      this.f = in.readByte();
      this.g = in.readBoolean();
   }

   public void write(PacketByteBuf out) {
      super.write(out);
      out.writeByte(this.e);
      out.writeByte(this.f);
      out.writeBoolean(this.g);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      super.handle((PacketHandlerPlayClientbound)handler);
   }
}
