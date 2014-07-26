package net.minecraft.network.play;

import java.util.List;
import java.util.UUID;
import net.minecraft.inventory.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketSpawnPlayer implements Packet {

   private int a;
   private UUID b;
   private int c;
   private int d;
   private int e;
   private byte f;
   private byte g;
   private int h;
   private xr i;
   private List j;


   public PacketSpawnPlayer() {}

   public PacketSpawnPlayer(agn arg_0) {
      this.a = arg_0.E();
      this.b = arg_0.bX().getId();
      this.c = uk.c(arg_0.s * 32.0D);
      this.d = uk.c(arg_0.t * 32.0D);
      this.e = uk.c(arg_0.u * 32.0D);
      this.f = (byte)((int)(arg_0.y * 256.0F / 360.0F));
      this.g = (byte)((int)(arg_0.z * 256.0F / 360.0F));
      ItemStack var2 = arg_0.bg.h();
      this.h = var2 == null?0:aky.b(var2.b());
      this.i = arg_0.G();
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
      this.j = xr.b(in);
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

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}
