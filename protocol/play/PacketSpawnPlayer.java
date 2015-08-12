package net.minecraft.network.play;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketSpawnPlayer implements Packet {

   private int a;
   private UUID b;
   private int c;
   private int d;
   private int e;
   private byte f;
   private byte g;
   private rh h;
   private List i;


   public PacketSpawnPlayer() {}

   public PacketSpawnPlayer(yn arg_0) {
      this.a = arg_0.F();
      this.b = arg_0.ci().getId();
      this.c = nu.c(arg_0.s * 32.0D);
      this.d = nu.c(arg_0.t * 32.0D);
      this.e = nu.c(arg_0.u * 32.0D);
      this.f = (byte)((int)(arg_0.y * 256.0F / 360.0F));
      this.g = (byte)((int)(arg_0.z * 256.0F / 360.0F));
      this.h = arg_0.I();
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = in.readUUID();
      this.c = in.readInt();
      this.d = in.readInt();
      this.e = in.readInt();
      this.f = in.readByte();
      this.g = in.readByte();
      this.i = rh.b(in);
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeUUID(this.b);
      out.writeInt(this.c);
      out.writeInt(this.d);
      out.writeInt(this.e);
      out.writeByte(this.f);
      out.writeByte(this.g);
      this.h.a(out);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public List a() {
      if(this.i == null) {
         this.i = this.h.c();
      }

      return this.i;
   }

   public int b() {
      return this.a;
   }

   public UUID c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public int e() {
      return this.d;
   }

   public int f() {
      return this.e;
   }

   public byte g() {
      return this.f;
   }

   public byte h() {
      return this.g;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
