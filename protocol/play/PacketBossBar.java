package net.minecraft.network.play;

import java.io.IOException;
import java.util.UUID;
import net.minecraft.chat.IChatMessage;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;
import net.minecraft.network.enums.BossBarAction;
import net.minecraft.network.enums.BossBarColor;
import net.minecraft.network.enums.BossBarParts;

public class PacketBossBar implements Packet {

   private UUID a;
   private BossBarAction b;
   private IChatMessage c;
   private float d;
   private BossBarColor e;
   private BossBarParts f;
   private boolean g;
   private boolean h;


   public PacketBossBar() {}

   public PacketBossBar(BossBarAction arg_0, oh arg_1) {
      this.b = arg_0;
      this.a = arg_1.d();
      this.c = arg_1.e();
      this.d = arg_1.f();
      this.e = arg_1.g();
      this.f = arg_1.h();
      this.g = arg_1.i();
      this.h = arg_1.j();
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readUUID();
      this.b = (BossBarAction)in.readEnum(BossBarAction.class);
      switch(fw$1.a[this.b.ordinal()]) {
      case 1:
         this.c = in.readChat();
         this.d = in.readFloat();
         this.e = (BossBarColor)in.readEnum(BossBarColor.class);
         this.f = (BossBarParts)in.readEnum(BossBarParts.class);
         this.a(in.readUnsignedByte());
      case 2:
      default:
         break;
      case 3:
         this.d = in.readFloat();
         break;
      case 4:
         this.c = in.readChat();
         break;
      case 5:
         this.e = (BossBarColor)in.readEnum(BossBarColor.class);
         this.f = (BossBarParts)in.readEnum(BossBarParts.class);
         break;
      case 6:
         this.a(in.readUnsignedByte());
      }

   }

   private void a(int arg_0) {
      this.g = (arg_0 & 1) > 0;
      this.h = (arg_0 & 2) > 0;
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeUUID(this.a);
      out.writeEnum(this.b);
      switch(fw$1.a[this.b.ordinal()]) {
      case 1:
         out.writeChat(this.c);
         out.writeFloat(this.d);
         out.writeEnum(this.e);
         out.writeEnum(this.f);
         out.writeByte(this.i());
      case 2:
      default:
         break;
      case 3:
         out.writeFloat(this.d);
         break;
      case 4:
         out.writeChat(this.c);
         break;
      case 5:
         out.writeEnum(this.e);
         out.writeEnum(this.f);
         break;
      case 6:
         out.writeByte(this.i());
      }

   }

   private int i() {
      int var1 = 0;
      if(this.g) {
         var1 |= 1;
      }

      if(this.h) {
         var1 |= 2;
      }

      return var1;
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public UUID a() {
      return this.a;
   }

   public BossBarAction b() {
      return this.b;
   }

   public IChatMessage c() {
      return this.c;
   }

   public float d() {
      return this.d;
   }

   public BossBarColor e() {
      return this.e;
   }

   public BossBarParts f() {
      return this.f;
   }

   public boolean g() {
      return this.g;
   }

   public boolean h() {
      return this.h;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
