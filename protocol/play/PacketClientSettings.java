package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketClientSettings implements Packet {

   private String a;
   private int b;
   private xw$b c;
   private boolean d;
   private int e;
   private qi f;


   public PacketClientSettings() {}

   public PacketClientSettings(String arg_0, int arg_1, xw$b arg_2, boolean arg_3, int arg_4, qi arg_5) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
      this.d = arg_3;
      this.e = arg_4;
      this.f = arg_5;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readString(7);
      this.b = in.readByte();
      this.c = (xw$b)in.readEnum(xw$b.class);
      this.d = in.readBoolean();
      this.e = in.readUnsignedByte();
      this.f = (qi)in.readEnum(qi.class);
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeString(this.a);
      out.writeByte(this.b);
      out.writeEnum(this.c);
      out.writeBoolean(this.d);
      out.writeByte(this.e);
      out.writeEnum(this.f);
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public String a() {
      return this.a;
   }

   public xw$b c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }

   public qi f() {
      return this.f;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
