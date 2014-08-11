package net.minecraft.network.play;

import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;
import net.minecraft.network.enums.TitleUpdateType;

public class PacketTitle implements Packet {

   private TitleUpdateType a;
   private IChatMessage b;
   private int c;
   private int d;
   private int e;


   public PacketTitle() {}

   public PacketTitle(TitleUpdateType arg_0, IChatMessage arg_1) {
      this(arg_0, arg_1, -1, -1, -1);
   }

   public PacketTitle(int arg_0, int arg_1, int arg_2) {
      this(TitleUpdateType.TIMES, (IChatMessage)null, arg_0, arg_1, arg_2);
   }

   public PacketTitle(TitleUpdateType arg_0, IChatMessage arg_1, int arg_2, int arg_3, int arg_4) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
      this.d = arg_3;
      this.e = arg_4;
   }

   public void read(PacketByteBuf in) {
      this.a = (TitleUpdateType)in.readEnum(TitleUpdateType.class);
      if(this.a == TitleUpdateType.TITLE || this.a == TitleUpdateType.SUBTITLE) {
         this.b = in.readChat();
      }

      if(this.a == TitleUpdateType.TIMES) {
         this.c = in.readInt();
         this.d = in.readInt();
         this.e = in.readInt();
      }

   }

   public void write(PacketByteBuf out) {
      out.writeEnum(this.a);
      if(this.a == TitleUpdateType.TITLE || this.a == TitleUpdateType.SUBTITLE) {
         out.writeChat(this.b);
      }

      if(this.a == TitleUpdateType.TIMES) {
         out.writeInt(this.c);
         out.writeInt(this.d);
         out.writeInt(this.e);
      }

   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public TitleUpdateType a() {
      return this.a;
   }

   public IChatMessage b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
