package net.minecraft.network.login;

import java.io.IOException;
import java.security.PublicKey;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerLoginClientbound;

public class PacketEncryptionRequest implements Packet {

   private String a;
   private PublicKey b;
   private byte[] c;


   public PacketEncryptionRequest() {}

   public PacketEncryptionRequest(String arg_0, PublicKey arg_1, byte[] arg_2) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readString(20);
      this.b = ni.a(in.readByteArray());
      this.c = in.readByteArray();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeString(this.a);
      out.writeByteArray(this.b.getEncoded());
      out.writeByteArray(this.c);
   }

   public void handle(PacketHandlerLoginClientbound handler) {
      handler.handle(this);
   }

   public String a() {
      return this.a;
   }

   public PublicKey b() {
      return this.b;
   }

   public byte[] c() {
      return this.c;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerLoginClientbound)handler);
   }
}
