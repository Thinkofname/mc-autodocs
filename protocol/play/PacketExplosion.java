package net.minecraft.network.play;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketExplosion implements Packet {

   private double a;
   private double b;
   private double c;
   private float d;
   private List e;
   private float f;
   private float g;
   private float h;


   public PacketExplosion() {}

   public PacketExplosion(double arg_0, double arg_2, double arg_4, float var7, List var8, bru var9) {
      this.a = arg_0;
      this.b = arg_2;
      this.c = arg_4;
      this.d = var7;
      this.e = Lists.newArrayList(var8);
      if(var9 != null) {
         this.f = (float)var9.a;
         this.g = (float)var9.b;
         this.h = (float)var9.c;
      }

   }

   public void read(PacketByteBuf in) {
      this.a = (double)in.readFloat();
      this.b = (double)in.readFloat();
      this.c = (double)in.readFloat();
      this.d = in.readFloat();
      int var2 = in.readInt();
      this.e = Lists.newArrayListWithCapacity(var2);
      int var3 = (int)this.a;
      int var4 = (int)this.b;
      int var5 = (int)this.c;

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7 = in.readByte() + var3;
         int var8 = in.readByte() + var4;
         int var9 = in.readByte() + var5;
         this.e.add(new Position(var7, var8, var9));
      }

      this.f = in.readFloat();
      this.g = in.readFloat();
      this.h = in.readFloat();
   }

   public void write(PacketByteBuf out) {
      out.writeFloat((float)this.a);
      out.writeFloat((float)this.b);
      out.writeFloat((float)this.c);
      out.writeFloat(this.d);
      out.writeInt(this.e.size());
      int var2 = (int)this.a;
      int var3 = (int)this.b;
      int var4 = (int)this.c;
      Iterator var5 = this.e.iterator();

      while(var5.hasNext()) {
         Position var6 = (Position)var5.next();
         int var7 = var6.n() - var2;
         int var8 = var6.o() - var3;
         int var9 = var6.p() - var4;
         out.writeByte(var7);
         out.writeByte(var8);
         out.writeByte(var9);
      }

      out.writeFloat(this.f);
      out.writeFloat(this.g);
      out.writeFloat(this.h);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public float a() {
      return this.f;
   }

   public float b() {
      return this.g;
   }

   public float c() {
      return this.h;
   }

   public double d() {
      return this.a;
   }

   public double e() {
      return this.b;
   }

   public double f() {
      return this.c;
   }

   public float g() {
      return this.d;
   }

   public List h() {
      return this.e;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
