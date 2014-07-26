package net.minecraft.network.play;

import java.util.List;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketEntityMetadata implements Packet {

   private int a;
   private List b;


   public PacketEntityMetadata() {}

   public PacketEntityMetadata(int arg_0, xr arg_1, boolean arg_2) {
      this.a = arg_0;
      if(arg_2) {
         this.b = arg_1.c();
      } else {
         this.b = arg_1.b();
      }

   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = xr.b(in);
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      xr.a(this.b, out);
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