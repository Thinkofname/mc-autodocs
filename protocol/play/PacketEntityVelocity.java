package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketEntityVelocity implements Packet {

   private int a;
   private int b;
   private int c;
   private int d;


   public PacketEntityVelocity() {}

   public PacketEntityVelocity(qq arg_0) {
      this(arg_0.F(), arg_0.v, arg_0.w, arg_0.x);
   }

   public PacketEntityVelocity(int arg_0, double arg_1, double arg_3, double var6) {
      this.a = arg_0;
      double var8 = 3.9D;
      if(arg_1 < -var8) {
         arg_1 = -var8;
      }

      if(arg_3 < -var8) {
         arg_3 = -var8;
      }

      if(var6 < -var8) {
         var6 = -var8;
      }

      if(arg_1 > var8) {
         arg_1 = var8;
      }

      if(arg_3 > var8) {
         arg_3 = var8;
      }

      if(var6 > var8) {
         var6 = var8;
      }

      this.b = (int)(arg_1 * 8000.0D);
      this.c = (int)(arg_3 * 8000.0D);
      this.d = (int)(var6 * 8000.0D);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = in.readShort();
      this.c = in.readShort();
      this.d = in.readShort();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeShort(this.b);
      out.writeShort(this.c);
      out.writeShort(this.d);
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

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
