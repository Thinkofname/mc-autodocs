package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketChangeGameState implements Packet {

   public static final String[] a = new String[]{"tile.bed.notValid"};
   private int b;
   private float c;


   public PacketChangeGameState() {}

   public PacketChangeGameState(int arg_0, float arg_1) {
      this.b = arg_0;
      this.c = arg_1;
   }

   public void read(PacketByteBuf in) {
      this.b = in.readUnsignedByte();
      this.c = in.readFloat();
   }

   public void write(PacketByteBuf out) {
      out.writeByte(this.b);
      out.writeFloat(this.c);
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
