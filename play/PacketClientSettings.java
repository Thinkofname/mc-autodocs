package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketClientSettings implements Packet {

   private String a;
   private int b;
   private agq c;
   private boolean d;
   private int e;


   public void read(PacketByteBuf in) {
      this.a = in.readString(7);
      this.b = in.readByte();
      this.c = agq.a(in.readByte());
      this.d = in.readBoolean();
      this.e = in.readUnsignedByte();
   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a);
      out.writeByte(this.b);
      out.writeByte(this.c.a());
      out.writeBoolean(this.d);
      out.writeByte(this.e);
   }

   public void a(lo arg_0) {
      arg_0.a(this);
   }

   public String a() {
      return this.a;
   }

   public agq c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((lo)arg_0);
   }
}
