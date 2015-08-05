package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketEntityTeleport implements Packet {

   private int a;
   private int b;
   private int c;
   private int d;
   private byte e;
   private byte f;
   private boolean g;


   public PacketEntityTeleport() {}

   public PacketEntityTeleport(qa arg_0) {
      this.a = arg_0.F();
      this.b = nu.c(arg_0.s * 32.0D);
      this.c = nu.c(arg_0.t * 32.0D);
      this.d = nu.c(arg_0.u * 32.0D);
      this.e = (byte)((int)(arg_0.y * 256.0F / 360.0F));
      this.f = (byte)((int)(arg_0.z * 256.0F / 360.0F));
      this.g = arg_0.C;
   }

   public PacketEntityTeleport(int arg_0, int arg_1, int arg_2, int arg_3, byte arg_4, byte arg_5, boolean arg_6) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
      this.d = arg_3;
      this.e = arg_4;
      this.f = arg_5;
      this.g = arg_6;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = in.readInt();
      this.c = in.readInt();
      this.d = in.readInt();
      this.e = in.readByte();
      this.f = in.readByte();
      this.g = in.readBoolean();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeInt(this.b);
      out.writeInt(this.c);
      out.writeInt(this.d);
      out.writeByte(this.e);
      out.writeByte(this.f);
      out.writeBoolean(this.g);
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

   public byte e() {
      return this.e;
   }

   public byte f() {
      return this.f;
   }

   public boolean g() {
      return this.g;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
