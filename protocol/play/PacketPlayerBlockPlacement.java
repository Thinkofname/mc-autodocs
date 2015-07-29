package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayServerbound;
import net.minecraft.network.enums.BlockFace;
import net.minecraft.network.enums.PlayerHand;

public class PacketPlayerBlockPlacement implements Packet {

   private Position a;
   private BlockFace b;
   private PlayerHand c;
   private float d;
   private float e;
   private float f;


   public PacketPlayerBlockPlacement() {}

   public PacketPlayerBlockPlacement(Position arg_0, BlockFace arg_1, PlayerHand arg_2, float arg_3, float arg_4, float arg_5) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
      this.d = arg_3;
      this.e = arg_4;
      this.f = arg_5;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readPosition();
      this.b = (BlockFace)in.readEnum(BlockFace.class);
      this.c = (PlayerHand)in.readEnum(PlayerHand.class);
      this.d = (float)in.readUnsignedByte() / 16.0F;
      this.e = (float)in.readUnsignedByte() / 16.0F;
      this.f = (float)in.readUnsignedByte() / 16.0F;
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writePosition(this.a);
      out.writeEnum(this.b);
      out.writeEnum(this.c);
      out.writeByte((int)(this.d * 16.0F));
      out.writeByte((int)(this.e * 16.0F));
      out.writeByte((int)(this.f * 16.0F));
   }

   public void handle(PacketHandlerPlayServerbound handler) {
      handler.handle(this);
   }

   public Position a() {
      return this.a;
   }

   public BlockFace b() {
      return this.b;
   }

   public PlayerHand c() {
      return this.c;
   }

   public float d() {
      return this.d;
   }

   public float e() {
      return this.e;
   }

   public float f() {
      return this.f;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayServerbound)handler);
   }
}
