package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketEntityEffect implements Packet {

   private int a;
   private byte b;
   private byte c;
   private int d;
   private byte e;


   public PacketEntityEffect() {}

   public PacketEntityEffect(int arg_0, wl arg_1) {
      this.a = arg_0;
      this.b = (byte)(arg_1.a() & 255);
      this.c = (byte)(arg_1.c() & 255);
      if(arg_1.b() > 32767) {
         this.d = 32767;
      } else {
         this.d = arg_1.b();
      }

      this.e = (byte)(arg_1.f()?1:0);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = in.readByte();
      this.c = in.readByte();
      this.d = in.readVarInt();
      this.e = in.readByte();
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeByte(this.b);
      out.writeByte(this.c);
      out.writeVarInt(this.d);
      out.writeByte(this.e);
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
