package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketWorldBorder implements Packet {

   private kq a;
   private int b;
   private double c;
   private double d;
   private double e;
   private double f;
   private long g;
   private int h;
   private int i;


   public PacketWorldBorder() {}

   public PacketWorldBorder(bee arg_0, kq arg_1) {
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
      this.a = (kq)in.readEnum(kq.class);
      switch(kp.a[this.a.ordinal()]) {
      case 1:
         this.e = in.readDouble();
         break;
      case 2:
         this.f = in.readDouble();
         this.e = in.readDouble();
         this.g = in.f();
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
         this.g = in.f();
         this.b = in.readVarInt();
         this.i = in.readVarInt();
         this.h = in.readVarInt();
      }

   }

   public void write(PacketByteBuf out) {
      out.writeEnum(this.a);
      switch(kp.a[this.a.ordinal()]) {
      case 1:
         out.writeDouble(this.e);
         break;
      case 2:
         out.writeDouble(this.f);
         out.writeDouble(this.e);
         out.b(this.g);
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
         out.b(this.g);
         out.writeVarInt(this.b);
         out.writeVarInt(this.i);
         out.writeVarInt(this.h);
      }

   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
