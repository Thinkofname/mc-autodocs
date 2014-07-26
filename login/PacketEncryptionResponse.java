package net.minecraft.network.login;

import java.security.PrivateKey;
import javax.crypto.SecretKey;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketEncryptionResponse implements Packet {

   private byte[] a = new byte[0];
   private byte[] b = new byte[0];


   public void read(PacketByteBuf in) {
      this.a = in.readByteArray();
      this.b = in.readByteArray();
   }

   public void write(PacketByteBuf out) {
      out.writeByteArray(this.a);
      out.writeByteArray(this.b);
   }

   public void a(nb arg_0) {
      arg_0.a(this);
   }

   public SecretKey a(PrivateKey arg_0) {
      return tv.a(arg_0, this.a);
   }

   public byte[] b(PrivateKey arg_0) {
      return arg_0 == null?this.b:tv.b(arg_0, this.b);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((nb)arg_0);
   }
}
