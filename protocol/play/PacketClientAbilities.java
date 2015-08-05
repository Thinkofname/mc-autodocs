package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;

public class PacketClientAbilities implements Packet {

   private boolean a;
   private boolean b;
   private boolean c;
   private boolean d;
   private float e;
   private float f;


   public PacketClientAbilities() {}

   public PacketClientAbilities(xu arg_0) {
      this.a(arg_0.a);
      this.b(arg_0.b);
      this.c(arg_0.c);
      this.d(arg_0.d);
      this.a(arg_0.a());
      this.b(arg_0.b());
   }

   public void read(PacketByteBuf in) throws IOException {
      byte var2 = in.readByte();
      this.a((var2 & 1) > 0);
      this.b((var2 & 2) > 0);
      this.c((var2 & 4) > 0);
      this.d((var2 & 8) > 0);
      this.a(in.readFloat());
      this.b(in.readFloat());
   }

   public void write(PacketByteBuf out) throws IOException {
      byte var2 = 0;
      if(this.a()) {
         var2 = (byte)(var2 | 1);
      }

      if(this.b()) {
         var2 = (byte)(var2 | 2);
      }

      if(this.c()) {
         var2 = (byte)(var2 | 4);
      }

      if(this.d()) {
         var2 = (byte)(var2 | 8);
      }

      out.writeByte(var2);
      out.writeFloat(this.e);
      out.writeFloat(this.f);
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public boolean a() {
      return this.a;
   }

   public void a(boolean arg_0) {
      this.a = arg_0;
   }

   public boolean b() {
      return this.b;
   }

   public void b(boolean arg_0) {
      this.b = arg_0;
   }

   public boolean c() {
      return this.c;
   }

   public void c(boolean arg_0) {
      this.c = arg_0;
   }

   public boolean d() {
      return this.d;
   }

   public void d(boolean arg_0) {
      this.d = arg_0;
   }

   public void a(float arg_0) {
      this.e = arg_0;
   }

   public void b(float arg_0) {
      this.f = arg_0;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
