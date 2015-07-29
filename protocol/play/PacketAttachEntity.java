package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketAttachEntity implements Packet {

   private int a;
   private int b;
   private int c;


   public PacketAttachEntity() {}

   public PacketAttachEntity(int arg_0, pr arg_1, pr arg_2) {
      this.a = arg_0;
      this.b = arg_1.F();
      this.c = arg_2 != null?arg_2.F():-1;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.b = in.readInt();
      this.c = in.readInt();
      this.a = in.readUnsignedByte();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeInt(this.b);
      out.writeInt(this.c);
      out.writeByte(this.a);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
