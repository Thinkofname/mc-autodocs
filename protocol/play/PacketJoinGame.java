package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketJoinGame implements Packet {

   private int a;
   private boolean b;
   private ara c;
   private int d;
   private vt e;
   private int f;
   private arc g;
   private boolean h;


   public PacketJoinGame() {}

   public PacketJoinGame(int arg_0, ara arg_1, boolean arg_2, int arg_3, vt arg_4, int arg_5, arc arg_6, boolean arg_7) {
      this.a = arg_0;
      this.d = arg_3;
      this.e = arg_4;
      this.c = arg_1;
      this.f = arg_5;
      this.b = arg_2;
      this.g = arg_6;
      this.h = arg_7;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readInt();
      short var2 = in.readUnsignedByte();
      this.b = (var2 & 8) == 8;
      int var3 = var2 & -9;
      this.c = ara.a(var3);
      this.d = in.readByte();
      this.e = vt.a(in.readUnsignedByte());
      this.f = in.readUnsignedByte();
      this.g = arc.a(in.readString(16));
      if(this.g == null) {
         this.g = arc.b;
      }

      this.h = in.readBoolean();
   }

   public void write(PacketByteBuf out) {
      out.writeInt(this.a);
      int var2 = this.c.a();
      if(this.b) {
         var2 |= 8;
      }

      out.writeByte(var2);
      out.writeByte(this.d);
      out.writeByte(this.e.a());
      out.writeByte(this.f);
      out.writeString(this.g.a());
      out.writeBoolean(this.h);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public int a() {
      return this.a;
   }

   public boolean b() {
      return this.b;
   }

   public ara c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public vt e() {
      return this.e;
   }

   public int f() {
      return this.f;
   }

   public arc g() {
      return this.g;
   }

   public boolean h() {
      return this.h;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
