package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

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

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public String toString() {
      return "Entity_" + super.toString();
   }

   public wv a(aqs arg_0) {
      return arg_0.a(this.a);
   }

   public byte a() {
      return this.b;
   }

   public byte b() {
      return this.c;
   }

   public byte c() {
      return this.d;
   }

   public byte d() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }

   public boolean f() {
      return this.h;
   }

   public boolean g() {
      return this.g;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
