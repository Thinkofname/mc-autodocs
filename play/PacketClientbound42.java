
public class PacketClientbound42 implements hb {

   public jb a;
   public int b;
   public int c;
   public int d;
   public String e;


   public PacketClientbound42() {}

   public PacketClientbound42(tq var1, jb var2) {
      this.a = var2;
      ux var3 = var1.c();
      switch(ja.a[var2.ordinal()]) {
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
      this.a = (jb)var1.readEnum(jb.class);
      if(this.a == jb.b) {
         this.d = var1.readVarInt();
         this.c = var1.readInt();
      } else if(this.a == jb.c) {
         this.b = var1.readVarInt();
         this.c = var1.readInt();
         this.e = var1.readString(32767);
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.a);
      if(this.a == jb.b) {
         var1.writeVarInt(this.d);
         var1.writeInt(this.c);
      } else if(this.a == jb.c) {
         var1.writeVarInt(this.b);
         var1.writeInt(this.c);
         var1.writeString(this.e);
      }

   }

   public void a(hh var1) {
      var1.a(this);
   }
}
