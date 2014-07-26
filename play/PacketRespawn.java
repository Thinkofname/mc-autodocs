package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketRespawn implements Packet {

   private int a;
   private vi b;
   private aqi c;
   private aqk d;


   public PacketRespawn() {}

   public PacketRespawn(int arg_0, vi arg_1, aqk arg_2, aqi arg_3) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_3;
      this.d = arg_2;
   }

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readInt();
      this.b = vi.a(in.readUnsignedByte());
      this.c = aqi.a(in.readUnsignedByte());
      this.d = aqk.a(in.readString(16));
      if(this.d == null) {
         this.d = aqk.b;
      }

   }

   public void write(PacketByteBuf out) {
      out.writeInt(this.a);
      out.writeByte(this.b.a());
      out.writeByte(this.c.a());
      out.writeString(this.d.a());
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}
