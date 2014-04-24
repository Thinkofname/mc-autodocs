
public class PacketClientbound42 extends gu {

   public ir a;
   public int b;
   public int c;
   public int d;
   public String e;


   public PacketClientbound42() {}

   public PacketClientbound42(tc var1, ir var2) {
      this.a = var2;
      uj var3 = var1.c();
      switch(iq.a[var2.ordinal()]) {
      case 1:
         this.d = var1.f();
         this.c = var3 == null?-1:var3.C();
         break;
      case 2:
         this.b = var1.h().C();
         this.c = var3 == null?-1:var3.C();
         this.e = var1.b().c();
      }

   }

   public void read(PacketBuffer var1) {
      this.a = (ir)ir.d.get(Integer.valueOf(var1.readUnsignedByte()));
      if(this.a == ir.b) {
         this.d = var1.readVarInt();
         this.c = var1.readInt();
      } else if(this.a == ir.c) {
         this.b = var1.readVarInt();
         this.c = var1.readInt();
         this.e = var1.readString(32767);
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a.e);
      if(this.a == ir.b) {
         var1.writeVarInt(this.d);
         var1.writeInt(this.c);
      } else if(this.a == ir.c) {
         var1.writeVarInt(this.b);
         var1.writeInt(this.c);
         var1.writeString(this.e);
      }

   }

   public void a(gx var1) {
      var1.a(this);
   }

   public String b() {
      return "event=" + this.a + ", playerId=" + this.b + ", entityId=" + this.c + ", duration=" + this.d + ", message=\'" + this.e + '\'';
   }
}
