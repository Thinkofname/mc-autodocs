
public class PacketClientbound42 extends gj {

   public ig a;
   public int b;
   public int c;
   public int d;
   public String e;


   public PacketClientbound42() {}

   public PacketClientbound42(rm var1, ig var2) {
      this.a = var2;
      sx var3 = var1.c();
      switch(ie.a[var2.ordinal()]) {
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
      this.a = (ig)ig.d.get(Integer.valueOf(var1.readUnsignedByte()));
      if(this.a == ig.b) {
         this.d = var1.readVarInt();
         this.c = var1.readInt();
      } else if(this.a == ig.c) {
         this.b = var1.readVarInt();
         this.c = var1.readInt();
         this.e = var1.readString(32767);
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a.e);
      if(this.a == ig.b) {
         var1.writeVarInt(this.d);
         var1.writeInt(this.c);
      } else if(this.a == ig.c) {
         var1.writeVarInt(this.b);
         var1.writeInt(this.c);
         var1.writeString(this.e);
      }

   }

   public void a(gm var1) {
      var1.a(this);
   }

   public String b() {
      return "event=" + this.a + ", playerId=" + this.b + ", entityId=" + this.c + ", duration=" + this.d + ", message=\'" + this.e + '\'';
   }
}
