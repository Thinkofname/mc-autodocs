package net.minecraft.network.login;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerLoginServerbound;

public class PacketEncryptionResponse implements Packet {

   private byte[] a = new byte[0];
   private byte[] b = new byte[0];


   public PacketEncryptionResponse() {}

   public PacketEncryptionResponse(SecretKey arg_0, PublicKey arg_1, byte[] arg_2) {
      this.a = ni.a((Key)arg_1, arg_0.getEncoded());
      this.b = ni.a((Key)arg_1, arg_2);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readByteArray();
      this.b = in.readByteArray();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeByteArray(this.a);
      out.writeByteArray(this.b);
   }

   public void handle(PacketHandlerLoginServerbound handler) {
      handler.handle(this);
   }

   public SecretKey a(PrivateKey arg_0) {
      return ni.a(arg_0, this.a);
   }

   public byte[] b(PrivateKey arg_0) {
      return arg_0 == null?this.b:ni.b(arg_0, this.b);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerLoginServerbound)handler);
   }
}
