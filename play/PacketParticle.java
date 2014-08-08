package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;
import net.minecraft.network.enums.Particle;

public class PacketParticle implements Packet {

   private Particle a;
   private float b;
   private float c;
   private float d;
   private float e;
   private float f;
   private float g;
   private float h;
   private int i;
   private boolean j;
   private int[] k;


   public PacketParticle() {}

   public PacketParticle(Particle arg_0, boolean arg_1, float arg_2, float arg_3, float arg_4, float arg_5, float arg_6, float arg_7, float arg_8, int arg_9, int ... arg_10) {
      this.a = arg_0;
      this.j = arg_1;
      this.b = arg_2;
      this.c = arg_3;
      this.d = arg_4;
      this.e = arg_5;
      this.f = arg_6;
      this.g = arg_7;
      this.h = arg_8;
      this.i = arg_9;
      this.k = arg_10;
   }

   public void read(PacketByteBuf in) {
      this.a = Particle.a(in.readInt());
      if(this.a == null) {
         this.a = Particle.BARRIER;
      }

      this.j = in.readBoolean();
      this.b = in.readFloat();
      this.c = in.readFloat();
      this.d = in.readFloat();
      this.e = in.readFloat();
      this.f = in.readFloat();
      this.g = in.readFloat();
      this.h = in.readFloat();
      this.i = in.readInt();
      int var2 = this.a.d();
      this.k = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.k[var3] = in.readVarInt();
      }

   }

   public void write(PacketByteBuf out) {
      out.writeInt(this.a.c());
      out.writeBoolean(this.j);
      out.writeFloat(this.b);
      out.writeFloat(this.c);
      out.writeFloat(this.d);
      out.writeFloat(this.e);
      out.writeFloat(this.f);
      out.writeFloat(this.g);
      out.writeFloat(this.h);
      out.writeInt(this.i);
      int var2 = this.a.d();

      for(int var3 = 0; var3 < var2; ++var3) {
         out.writeVarInt(this.k[var3]);
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
