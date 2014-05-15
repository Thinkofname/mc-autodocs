
public class PacketClientbound42 extends gx {

   public iu a;
   public int b;
   public int c;
   public int d;
   public String e;


   public PacketClientbound42() {}

   public PacketClientbound42(tl var1, iu var2) {
      this.a = var2;
      us var3 = var1.c();
      switch(it.a[var2.ordinal()]) {
      case 1:
         this.d = var1.f();
         this.c = var3 == null?-1:var3.D();
         break;
      case 2:
         this.b = var1.h().D();
         this.c = var3 == null?-1:var3.D();
         this.e = var1.b().c();
      }

   }

   public void read(PacketBuffer var1) {
      this.a = (iu)iu.d.get(Integer.valueOf(var1.readUnsignedByte()));
      if(this.a == iu.b) {
         this.d = var1.readVarInt();
         this.c = var1.readInt();
      } else if(this.a == iu.c) {
         this.b = var1.readVarInt();
         this.c = var1.readInt();
         this.e = var1.readString(32767);
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a.e);
      if(this.a == iu.b) {
         var1.writeVarInt(this.d);
         var1.writeInt(this.c);
      } else if(this.a == iu.c) {
         var1.writeVarInt(this.b);
         var1.writeInt(this.c);
         var1.writeString(this.e);
      }

   }

   public void a(ha var1) {
      var1.a(this);
   }

   public String b() {
      return "event=" + this.a + ", playerId=" + this.b + ", entityId=" + this.c + ", duration=" + this.d + ", message=\'" + this.e + '\'';
   }
}
