package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketRespawn implements Packet {

   private int a;
   private pl b;
   private agf$a c;
   private agh d;


   public PacketRespawn() {}

   public PacketRespawn(int arg_0, pl arg_1, agh arg_2, agf$a arg_3) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_3;
      this.d = arg_2;
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readInt();
      this.b = pl.a(in.readUnsignedByte());
      this.c = agf$a.a(in.readUnsignedByte());
      this.d = agh.a(in.readString(16));
      if(this.d == null) {
         this.d = agh.b;
      }

   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeInt(this.a);
      out.writeByte(this.b.a());
      out.writeByte(this.c.a());
      out.writeString(this.d.a());
   }

   public int a() {
      return this.a;
   }

   public pl b() {
      return this.b;
   }

   public agf$a c() {
      return this.c;
   }

   public agh d() {
      return this.d;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
