package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;
import org.apache.commons.lang3.Validate;

public class PacketSoundEffect implements Packet {

   private String a;
   private int b;
   private int c = Integer.MAX_VALUE;
   private int d;
   private float e;
   private int f;


   public PacketSoundEffect() {}

   public PacketSoundEffect(String arg_0, double arg_1, double arg_3, double arg_5, float var8, float var9) {
      Validate.notNull(arg_0, "name", new Object[0]);
      this.a = arg_0;
      this.b = (int)(arg_1 * 8.0D);
      this.c = (int)(arg_3 * 8.0D);
      this.d = (int)(arg_5 * 8.0D);
      this.e = var8;
      this.f = (int)(var9 * 63.0F);
      var9 = nu.a(var9, 0.0F, 255.0F);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readString(256);
      this.b = in.readInt();
      this.c = in.readInt();
      this.d = in.readInt();
      this.e = in.readFloat();
      this.f = in.readUnsignedByte();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeString(this.a);
      out.writeInt(this.b);
      out.writeInt(this.c);
      out.writeInt(this.d);
      out.writeFloat(this.e);
      out.writeByte(this.f);
   }

   public String a() {
      return this.a;
   }

   public double b() {
      return (double)((float)this.b / 8.0F);
   }

   public double c() {
      return (double)((float)this.c / 8.0F);
   }

   public double d() {
      return (double)((float)this.d / 8.0F);
   }

   public float e() {
      return this.e;
   }

   public float f() {
      return (float)this.f / 63.0F;
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
