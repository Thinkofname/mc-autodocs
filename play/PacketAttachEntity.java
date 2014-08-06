package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketAttachEntity implements Packet {

   private int a;
   private int b;
   private int c;


   public PacketAttachEntity() {}

   public PacketAttachEntity(int arg_0, ws arg_1, ws arg_2) {
      this.a = arg_0;
      this.b = arg_1.E();
      this.c = arg_2 != null?arg_2.E():-1;
   }

   public void read(PacketByteBuf in) {
      this.b = in.readInt();
      this.c = in.readInt();
      this.a = in.readUnsignedByte();
   }

   public void write(PacketByteBuf out) {
      out.writeInt(this.b);
      out.writeInt(this.c);
      out.writeByte(this.a);
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
