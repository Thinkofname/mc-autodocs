package net.minecraft.network.handshaking;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.Protocols;

public class PacketHandshake implements Packet {

   private int a;
   private String b;
   private int c;
   private Protocols d;


   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = in.readString(255);
      this.c = in.readUnsignedShort();
      this.d = Protocols.a(in.readVarInt());
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeString(this.b);
      out.writeShort(this.c);
      out.writeVarInt(this.d.a());
   }

   public void a(mu arg_0) {
      arg_0.a(this);
   }

   public Protocols a() {
      return this.d;
   }

   public int b() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((mu)arg_0);
   }
}
