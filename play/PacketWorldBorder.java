package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketWorldBorder implements Packet {

   private kp a;
   private int b;
   private double c;
   private double d;
   private double e;
   private double f;
   private int g;
   private int h;
   private int i;


   public PacketWorldBorder() {}

   public PacketWorldBorder(bdx arg_0, kp arg_1) {
      this.a = arg_1;
      this.c = arg_0.f();
      this.d = arg_0.g();
      this.f = arg_0.h();
      this.e = arg_0.j();
      this.g = arg_0.i();
      this.b = arg_0.l();
      this.i = arg_0.q();
      this.h = arg_0.p();
   }

   public void read(PacketByteBuf in) {
      this.a = (kp)in.readEnum(kp.class);
      switch(ko.a[this.a.ordinal()]) {
      case 1:
         this.e = in.readDouble();
         break;
      case 2:
         this.f = in.readDouble();
         this.e = in.readDouble();
         this.g = in.readVarInt();
         break;
      case 3:
         this.c = in.readDouble();
         this.d = in.readDouble();
         break;
      case 4:
         this.i = in.readVarInt();
         break;
      case 5:
         this.h = in.readVarInt();
         break;
      case 6:
         this.c = in.readDouble();
         this.d = in.readDouble();
         this.f = in.readDouble();
         this.e = in.readDouble();
         this.g = in.readVarInt();
         this.b = in.readVarInt();
         this.i = in.readVarInt();
         this.h = in.readVarInt();
      }

   }

   public void write(PacketByteBuf out) {
      out.writeEnum(this.a);
      switch(ko.a[this.a.ordinal()]) {
      case 1:
         out.writeDouble(this.e);
         break;
      case 2:
         out.writeDouble(this.f);
         out.writeDouble(this.e);
         out.writeVarInt(this.g);
         break;
      case 3:
         out.writeDouble(this.c);
         out.writeDouble(this.d);
         break;
      case 4:
         out.writeVarInt(this.i);
         break;
      case 5:
         out.writeVarInt(this.h);
         break;
      case 6:
         out.writeDouble(this.c);
         out.writeDouble(this.d);
         out.writeDouble(this.f);
         out.writeDouble(this.e);
         out.writeVarInt(this.g);
         out.writeVarInt(this.b);
         out.writeVarInt(this.i);
         out.writeVarInt(this.h);
      }

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
