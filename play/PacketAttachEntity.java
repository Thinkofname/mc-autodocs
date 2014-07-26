package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketAttachEntity implements Packet {

   private int a;
   private int b;
   private int c;


   public PacketAttachEntity() {}

   public PacketAttachEntity(int arg_0, wk arg_1, wk arg_2) {
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

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}
