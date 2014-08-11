package net.minecraft.network.play;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;
import net.minecraft.network.play.PacketEntity;

public class PacketEntityLookAndRelativeMove extends PacketEntity {

   public PacketEntityLookAndRelativeMove() {
      this.h = true;
   }

   public PacketEntityLookAndRelativeMove(int arg_0, byte arg_1, byte arg_2, byte arg_3, byte arg_4, byte arg_5, boolean arg_6) {
      super(arg_0);
      this.b = arg_1;
      this.c = arg_2;
      this.d = arg_3;
      this.e = arg_4;
      this.f = arg_5;
      this.g = arg_6;
      this.h = true;
   }

   public void read(PacketByteBuf in) {
      super.read(in);
      this.b = in.readByte();
      this.c = in.readByte();
      this.d = in.readByte();
      this.e = in.readByte();
      this.f = in.readByte();
      this.g = in.readBoolean();
   }

   public void write(PacketByteBuf out) {
      super.write(out);
      out.writeByte(this.b);
      out.writeByte(this.c);
      out.writeByte(this.d);
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
