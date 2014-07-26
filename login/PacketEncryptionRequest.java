package net.minecraft.network.login;

import java.security.PublicKey;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

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

   public void read(PacketByteBuf in) {
      this.a = in.readString(20);
      this.b = tv.a(in.readByteArray());
      this.c = in.readByteArray();
   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a);
      out.writeByteArray(this.b.getEncoded());
      out.writeByteArray(this.c);
   }

   public void a(mw arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((mw)arg_0);
   }
}
