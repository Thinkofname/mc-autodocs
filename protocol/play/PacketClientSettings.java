package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketClientSettings implements Packet {

   private String a;
   private int b;
   private ys$b c;
   private boolean d;
   private int e;
   private rd f;


   public PacketClientSettings() {}

   public PacketClientSettings(String arg_0, int arg_1, ys$b arg_2, boolean arg_3, int arg_4, rd arg_5) {
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
      this.c = (ys$b)in.readEnum(ys$b.class);
      this.d = in.readBoolean();
      this.e = in.readUnsignedByte();
      this.f = (rd)in.readEnum(rd.class);
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

   public ys$b c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }

   public rd f() {
      return this.f;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
