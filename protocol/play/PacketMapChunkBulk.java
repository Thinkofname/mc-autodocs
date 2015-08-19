package net.minecraft.network.play;

import java.io.IOException;
import java.util.List;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;
import net.minecraft.network.play.PacketChunkData;

public class PacketMapChunkBulk implements Packet {

   private int[] a;
   private int[] b;
   private go$a[] c;
   private boolean d;


   public PacketMapChunkBulk() {}

   public PacketMapChunkBulk(List arg_0) {
      int var2 = arg_0.size();
      this.a = new int[var2];
      this.b = new int[var2];
      this.c = new go$a[var2];
      this.d = !((aqi)arg_0.get(0)).q().t.m();

      for(int var3 = 0; var3 < var2; ++var3) {
         aqi var4 = (aqi)arg_0.get(var3);
         go$a var5 = PacketChunkData.a(var4, true, this.d, '\uffff');
         this.a[var3] = var4.a;
         this.b[var3] = var4.b;
         this.c[var3] = var5;
      }

   }

   public void read(PacketByteBuf in) throws IOException {
      this.d = in.readBoolean();
      int var2 = in.readVarInt();
      this.a = new int[var2];
      this.b = new int[var2];
      this.c = new go$a[var2];

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         this.a[var3] = in.readInt();
         this.b[var3] = in.readInt();
         this.c[var3] = new go$a();
         this.c[var3].b = in.readShort() & '\uffff';
         this.c[var3].a = new byte[PacketChunkData.a(Integer.bitCount(this.c[var3].b), this.d, true)];
      }

      for(var3 = 0; var3 < var2; ++var3) {
         in.readBytes(this.c[var3].a);
      }

   }

   public void write(PacketByteBuf out) throws IOException {
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

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public int a(int arg_0) {
      return this.a[arg_0];
   }

   public int b(int arg_0) {
      return this.b[arg_0];
   }

   public int a() {
      return this.a.length;
   }

   public byte[] c(int arg_0) {
      return this.c[arg_0].a;
   }

   public int d(int arg_0) {
      return this.c[arg_0].b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
