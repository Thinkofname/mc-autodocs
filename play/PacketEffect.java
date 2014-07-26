package net.minecraft.network.play;

import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketEffect implements Packet {

   private int a;
   private Position b;
   private int c;
   private boolean d;


   public PacketEffect() {}

   public PacketEffect(int arg_0, Position arg_1, int arg_2, boolean arg_3) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
      this.d = arg_3;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readInt();
      this.b = in.readPosition();
      this.c = in.readInt();
      this.d = in.readBoolean();
   }

   public void write(PacketByteBuf out) {
      out.writeInt(this.a);
      out.writePosition(this.b);
      out.writeInt(this.c);
      out.writeBoolean(this.d);
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
