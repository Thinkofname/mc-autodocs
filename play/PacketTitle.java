package net.minecraft.network.play;

import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketTitle implements Packet {

   private li a;
   private IChatMessage b;
   private int c;
   private int d;
   private int e;


   public PacketTitle() {}

   public PacketTitle(li arg_0, IChatMessage arg_1) {
      this(arg_0, arg_1, -1, -1, -1);
   }

   public PacketTitle(int arg_0, int arg_1, int arg_2) {
      this(li.c, (IChatMessage)null, arg_0, arg_1, arg_2);
   }

   public PacketTitle(li arg_0, IChatMessage arg_1, int arg_2, int arg_3, int arg_4) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
      this.d = arg_3;
      this.e = arg_4;
   }

   public void read(PacketByteBuf in) {
      this.a = (li)in.readEnum(li.class);
      if(this.a == li.a || this.a == li.b) {
         this.b = in.readChat();
      }

      if(this.a == li.c) {
         this.c = in.readInt();
         this.d = in.readInt();
         this.e = in.readInt();
      }

   }

   public void write(PacketByteBuf out) {
      out.writeEnum(this.a);
      if(this.a == li.a || this.a == li.b) {
         out.writeChat(this.b);
      }

      if(this.a == li.c) {
         out.writeInt(this.c);
         out.writeInt(this.d);
         out.writeInt(this.e);
      }

   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
