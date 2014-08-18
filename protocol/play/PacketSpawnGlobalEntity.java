package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketSpawnGlobalEntity implements Packet {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;


   public PacketSpawnGlobalEntity() {}

   public PacketSpawnGlobalEntity(wv arg_0) {
      this.a = arg_0.F();
      this.b = uv.c(arg_0.s * 32.0D);
      this.c = uv.c(arg_0.t * 32.0D);
      this.d = uv.c(arg_0.u * 32.0D);
      if(arg_0 instanceof adp) {
         this.e = 1;
      }

   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.e = in.readByte();
      this.b = in.readInt();
      this.c = in.readInt();
      this.d = in.readInt();
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeByte(this.e);
      out.writeInt(this.b);
      out.writeInt(this.c);
      out.writeInt(this.d);
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

   public int d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
