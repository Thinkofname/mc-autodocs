package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketClientSettings implements Packet {

   private String a;
   private int b;
   private agy c;
   private boolean d;
   private int e;


   public void read(PacketByteBuf in) {
      this.a = in.readString(7);
      this.b = in.readByte();
      this.c = agy.a(in.readByte());
      this.d = in.readBoolean();
      this.e = in.readUnsignedByte();
   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a);
      out.writeByte(this.b);
      out.writeByte(this.c.a());
      out.writeBoolean(this.d);
      out.writeByte(this.e);
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public String a() {
      return this.a;
   }

   public agy c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
