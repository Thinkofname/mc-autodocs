package net.minecraft.network.play;

import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketOpenWindow implements Packet {

   private int a;
   private String b;
   private IChatMessage c;
   private int d;
   private int e;


   public PacketOpenWindow() {}

   public PacketOpenWindow(int arg_0, String arg_1, IChatMessage arg_2) {
      this(arg_0, arg_1, arg_2, 0);
   }

   public PacketOpenWindow(int arg_0, String arg_1, IChatMessage arg_2, int arg_3) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
      this.d = arg_3;
   }

   public PacketOpenWindow(int arg_0, String arg_1, IChatMessage arg_2, int arg_3, int arg_4) {
      this(arg_0, arg_1, arg_2, arg_3);
      this.e = arg_4;
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) {
      this.a = in.readUnsignedByte();
      this.b = in.readString(32);
      this.c = in.readChat();
      this.d = in.readUnsignedByte();
      if(this.b.equals("EntityHorse")) {
         this.e = in.readInt();
      }

   }

   public void write(PacketByteBuf out) {
      out.writeByte(this.a);
      out.writeString(this.b);
      out.writeChat(this.c);
      out.writeByte(this.d);
      if(this.b.equals("EntityHorse")) {
         out.writeInt(this.e);
      }

   }

   public int a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public IChatMessage c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }

   public boolean f() {
      return this.d > 0;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
