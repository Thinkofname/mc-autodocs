package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;
import net.minecraft.network.play.PacketEntity;

public class PacketEntityRelativeMove extends PacketEntity {

   public PacketEntityRelativeMove() {}

   public PacketEntityRelativeMove(int arg_0, byte arg_1, byte arg_2, byte arg_3, boolean arg_4) {
      super(arg_0);
      this.b = arg_1;
      this.c = arg_2;
      this.d = arg_3;
      this.g = arg_4;
   }

   public void read(PacketByteBuf in) throws IOException {
      super.read(in);
      this.b = in.readByte();
      this.c = in.readByte();
      this.d = in.readByte();
      this.g = in.readBoolean();
   }

   public void write(PacketByteBuf out) throws IOException {
      super.write(out);
      out.writeByte(this.b);
      out.writeByte(this.c);
      out.writeByte(this.d);
      out.writeBoolean(this.g);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      super.handle((PacketHandlerPlayClientbound)handler);
   }
}
