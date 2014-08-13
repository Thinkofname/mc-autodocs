package net.minecraft.network.play;

import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;
import org.apache.commons.lang3.StringUtils;

public class PacketTabComplete implements Packet {

   private String a;
   private Position b;


   public PacketTabComplete() {}

   public PacketTabComplete(String arg_0) {
      this(arg_0, (Position)null);
   }

   public PacketTabComplete(String arg_0, Position arg_1) {
      this.a = arg_0;
      this.b = arg_1;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readString(32767);
      boolean var2 = in.readBoolean();
      if(var2) {
         this.b = in.readPosition();
      }

   }

   public void write(PacketByteBuf out) {
      out.writeString(StringUtils.substring(this.a, 0, 32767));
      boolean var2 = this.b != null;
      out.writeBoolean(var2);
      if(var2) {
         out.writePosition(this.b);
      }

   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public String a() {
      return this.a;
   }

   public Position b() {
      return this.b;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
