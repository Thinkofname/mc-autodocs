package net.minecraft.network.play;

import java.util.List;
import java.util.UUID;
import net.minecraft.inventory.Item;
import net.minecraft.inventory.ItemStack;
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
   private int h;
   private xv i;
   private List j;


   public PacketSpawnPlayer() {}

   public PacketSpawnPlayer(ahd arg_0) {
      this.a = arg_0.F();
      this.b = arg_0.cc().getId();
      this.c = uv.c(arg_0.s * 32.0D);
      this.d = uv.c(arg_0.t * 32.0D);
      this.e = uv.c(arg_0.u * 32.0D);
      this.f = (byte)((int)(arg_0.y * 256.0F / 360.0F));
      this.g = (byte)((int)(arg_0.z * 256.0F / 360.0F));
      ItemStack var2 = arg_0.bg.h();
      this.h = var2 == null?0:Item.b(var2.b());
      this.i = arg_0.H();
   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = in.readUUID();
      this.c = in.readInt();
      this.d = in.readInt();
      this.e = in.readInt();
      this.f = in.readByte();
      this.g = in.readByte();
      this.h = in.readShort();
      this.j = xv.b(in);
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeUUID(this.b);
      out.writeInt(this.c);
      out.writeInt(this.d);
      out.writeInt(this.e);
      out.writeByte(this.f);
      out.writeByte(this.g);
      out.writeShort(this.h);
      this.i.a(out);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public List a() {
      if(this.j == null) {
         this.j = this.i.c();
      }

      return this.j;
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

   public int i() {
      return this.h;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
