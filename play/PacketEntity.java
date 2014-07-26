package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketEntity implements Packet {

   public int a;
   public byte b;
   public byte c;
   public byte d;
   public byte e;
   public byte f;
   public boolean g;
   public boolean h;


   public PacketEntity() {}

   public PacketEntity(int arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
   }

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   public String toString() {
      return "Entity_" + super.toString();
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}
