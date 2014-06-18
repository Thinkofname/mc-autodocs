
public class PacketClientbound42 implements ha {

   public ja a;
   public int b;
   public int c;
   public int d;
   public String e;


   public PacketClientbound42() {}

   public PacketClientbound42(to var1, ja var2) {
      this.a = var2;
      uv var3 = var1.c();
      switch(iz.a[var2.ordinal()]) {
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
      this.a = (ja)var1.readEnum(ja.class);
      if(this.a == ja.b) {
         this.d = var1.readVarInt();
         this.c = var1.readInt();
      } else if(this.a == ja.c) {
         this.b = var1.readVarInt();
         this.c = var1.readInt();
         this.e = var1.readString(32767);
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.a);
      if(this.a == ja.b) {
         var1.writeVarInt(this.d);
         var1.writeInt(this.c);
      } else if(this.a == ja.c) {
         var1.writeVarInt(this.b);
         var1.writeInt(this.c);
         var1.writeString(this.e);
      }

   }

   public void a(hg var1) {
      var1.a(this);
   }
}
