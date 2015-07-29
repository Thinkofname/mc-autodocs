package net.minecraft.network.handshaking;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerHandshakingServerbound;
import net.minecraft.network.Protocols;

public class PacketHandshake implements Packet {

   private int a;
   private String b;
   private int c;
   private Protocols d;


   public PacketHandshake() {}

   public PacketHandshake(int arg_0, String arg_1, int arg_2, Protocols arg_3) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
      this.d = arg_3;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
      this.b = in.readString(255);
      this.c = in.readUnsignedShort();
      this.d = Protocols.a(in.readVarInt());
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
      out.writeString(this.b);
      out.writeShort(this.c);
      out.writeVarInt(this.d.a());
   }

   public void handle(PacketHandlerHandshakingServerbound handler) {
      handler.handle(this);
   }

   public Protocols a() {
      return this.d;
   }

   public int b() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerHandshakingServerbound)handler);
   }
}
