package net.minecraft.network.play;

import java.util.List;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.play.PacketChunkData;

public class PacketMapChunkBulk implements Packet {

   private int[] a;
   private int[] b;
   private jo[] c;
   private boolean d;


   public PacketMapChunkBulk() {}

   public PacketMapChunkBulk(List arg_0) {
      int var2 = arg_0.size();
      this.a = new int[var2];
      this.b = new int[var2];
      this.c = new jo[var2];
      this.d = !((bed)arg_0.get(0)).p().t.p();

      for(int var3 = 0; var3 < var2; ++var3) {
         bed var4 = (bed)arg_0.get(var3);
         jo var5 = PacketChunkData.a(var4, true, this.d, '\uffff');
         this.a[var3] = var4.a;
         this.b[var3] = var4.b;
         this.c[var3] = var5;
      }

   }

   public void read(PacketByteBuf in) {
      this.d = in.readBoolean();
      int var2 = in.readVarInt();
      this.a = new int[var2];
      this.b = new int[var2];
      this.c = new jo[var2];

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         this.a[var3] = in.readInt();
         this.b[var3] = in.readInt();
         this.c[var3] = new jo();
         this.c[var3].b = in.readShort() & '\uffff';
         this.c[var3].a = new byte[PacketChunkData.a(Integer.bitCount(this.c[var3].b), this.d, true)];
      }

      for(var3 = 0; var3 < var2; ++var3) {
         in.readBytes(this.c[var3].a);
      }

   }

   public void write(PacketByteBuf out) {
      out.writeBoolean(this.d);
      out.writeVarInt(this.c.length);

      int var2;
      for(var2 = 0; var2 < this.a.length; ++var2) {
         out.writeInt(this.a[var2]);
         out.writeInt(this.b[var2]);
         out.writeShort((short)(this.c[var2].b & '\uffff'));
      }

      for(var2 = 0; var2 < this.a.length; ++var2) {
         out.writeBytes(this.c[var2].a);
      }

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