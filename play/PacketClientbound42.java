
public class PacketClientbound42 implements hz {

   public kb a;
   public int b;
   public int c;
   public int d;
   public String e;


   public PacketClientbound42() {}

   public PacketClientbound42(vr var1, kb var2) {
      this.a = var2;
      xa var3 = var1.c();
      switch(ka.a[var2.ordinal()]) {
      case 1:
         this.d = var1.f();
         this.c = var3 == null?-1:var3.E();
         break;
      case 2:
         this.b = var1.h().E();
         this.c = var3 == null?-1:var3.E();
         this.e = var1.b().c();
      }

   }

   public void read(PacketBuffer var1) {
      this.a = (kb)var1.readEnum(kb.class);
      if(this.a == kb.b) {
         this.d = var1.readVarInt();
         this.c = var1.readInt();
      } else if(this.a == kb.c) {
         this.b = var1.readVarInt();
         this.c = var1.readInt();
         this.e = var1.readString(32767);
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeEnum(this.a);
      if(this.a == kb.b) {
         var1.writeVarInt(this.d);
         var1.writeInt(this.c);
      } else if(this.a == kb.c) {
         var1.writeVarInt(this.b);
         var1.writeInt(this.c);
         var1.writeString(this.e);
      }

   }

   public void a(ig var1) {
      var1.a(this);
   }
}
