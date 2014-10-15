package net.minecraft.network.play;

import java.util.List;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketEntityMetadata implements Packet {

   private int a;
   private List b;


   public PacketEntityMetadata() {}

   public PacketEntityMetadata(int arg_0, xy arg_1, boolean arg_2) {
      this.a = arg_0;
      if(arg_2) {
         this.b = arg_1.c();
      } else {
         this.b = arg_1.b();
      }

   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = xy.b(in);
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      xy.a(this.b, out);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public List a() {
      return this.b;
   }

   public int b() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
