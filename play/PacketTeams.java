package net.minecraft.network.play;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Iterator;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketTeams implements Packet {

   private String a = "";
   private String b = "";
   private String c = "";
   private String d = "";
   private String e;
   private int f;
   private Collection g;
   private int h;
   private int i;


   public PacketTeams() {
      this.e = bri.a.e;
      this.f = -1;
      this.g = Lists.newArrayList();
   }

   public PacketTeams(brb arg_0, int arg_1) {
      this.e = bri.a.e;
      this.f = -1;
      this.g = Lists.newArrayList();
      this.a = arg_0.b();
      this.h = arg_1;
      if(arg_1 == 0 || arg_1 == 2) {
         this.b = arg_0.c();
         this.c = arg_0.e();
         this.d = arg_0.f();
         this.i = arg_0.k();
         this.e = arg_0.i().e;
         this.f = arg_0.l().b();
      }

      if(arg_1 == 0) {
         this.g.addAll(arg_0.d());
      }

   }

   public PacketTeams(brb arg_0, Collection arg_1, int arg_2) {
      this.e = bri.a.e;
      this.f = -1;
      this.g = Lists.newArrayList();
      if(arg_2 != 3 && arg_2 != 4) {
         throw new IllegalArgumentException("Method must be join or leave for player constructor");
      } else if(arg_1 != null && !arg_1.isEmpty()) {
         this.h = arg_2;
         this.a = arg_0.b();
         this.g.addAll(arg_1);
      } else {
         throw new IllegalArgumentException("Players cannot be null/empty");
      }
   }

   public void read(PacketByteBuf in) {
      this.a = in.readString(16);
      this.h = in.readByte();
      if(this.h == 0 || this.h == 2) {
         this.b = in.readString(32);
         this.c = in.readString(16);
         this.d = in.readString(16);
         this.i = in.readByte();
         this.e = in.readString(32);
         this.f = in.readByte();
      }

      if(this.h == 0 || this.h == 3 || this.h == 4) {
         int var2 = in.readVarInt();

         for(int var3 = 0; var3 < var2; ++var3) {
            this.g.add(in.readString(40));
         }
      }

   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a);
      out.writeByte(this.h);
      if(this.h == 0 || this.h == 2) {
         out.writeString(this.b);
         out.writeString(this.c);
         out.writeString(this.d);
         out.writeByte(this.i);
         out.writeString(this.e);
         out.writeByte(this.f);
      }

      if(this.h == 0 || this.h == 3 || this.h == 4) {
         out.writeVarInt(this.g.size());
         Iterator var2 = this.g.iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            out.writeString(var3);
         }
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
