package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketRespawn implements Packet {

   private int a;
   private vt b;
   private arc c;
   private are d;


   public PacketRespawn() {}

   public PacketRespawn(int arg_0, vt arg_1, are arg_2, arc arg_3) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_3;
      this.d = arg_2;
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readInt();
      this.b = vt.a(in.readUnsignedByte());
      this.c = arc.a(in.readUnsignedByte());
      this.d = are.a(in.readString(16));
      if(this.d == null) {
         this.d = are.b;
      }

   }

   public void write(PacketByteBuf out) {
      out.writeInt(this.a);
      out.writeByte(this.b.a());
      out.writeByte(this.c.a());
      out.writeString(this.d.a());
   }

   public int a() {
      return this.a;
   }

   public vt b() {
      return this.b;
   }

   public arc c() {
      return this.c;
   }

   public are d() {
      return this.d;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
