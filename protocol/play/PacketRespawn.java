package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketRespawn implements Packet {

   private int a;
   private pq b;
   private agn$a c;
   private agp d;


   public PacketRespawn() {}

   public PacketRespawn(int arg_0, pq arg_1, agp arg_2, agn$a arg_3) {
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
      this.b = pq.a(in.readUnsignedByte());
      this.c = agn$a.a(in.readUnsignedByte());
      this.d = agp.a(in.readString(16));
      if(this.d == null) {
         this.d = agp.b;
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

   public pq b() {
      return this.b;
   }

   public agn$a c() {
      return this.c;
   }

   public agp d() {
      return this.d;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
