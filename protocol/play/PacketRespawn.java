package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketRespawn implements Packet {

   private int a;
   private pb b;
   private afu$a c;
   private afw d;


   public PacketRespawn() {}

   public PacketRespawn(int arg_0, pb arg_1, afw arg_2, afu$a arg_3) {
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
      this.b = pb.a(in.readUnsignedByte());
      this.c = afu$a.a(in.readUnsignedByte());
      this.d = afw.a(in.readString(16));
      if(this.d == null) {
         this.d = afw.b;
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

   public pb b() {
      return this.b;
   }

   public afu$a c() {
      return this.c;
   }

   public afw d() {
      return this.d;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
