import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Iterator;

public class PacketClientbound3E extends gu {

   private String a = "";
   private String b = "";
   private String c = "";
   private String d = "";
   private String e;
   private int f;
   private Collection g;
   private int h;
   private int i;


   public PacketClientbound3E() {
      this.e = bit.a.e;
      this.f = -1;
      this.g = Lists.newArrayList();
   }

   public PacketClientbound3E(bim var1, int var2) {
      this.e = bit.a.e;
      this.f = -1;
      this.g = Lists.newArrayList();
      this.a = var1.b();
      this.h = var2;
      if(var2 == 0 || var2 == 2) {
         this.b = var1.c();
         this.c = var1.e();
         this.d = var1.f();
         this.i = var1.k();
         this.e = var1.i().e;
         this.f = var1.l().b();
      }

      if(var2 == 0) {
         this.g.addAll(var1.d());
      }

   }

   public PacketClientbound3E(bim var1, Collection var2, int var3) {
      this.e = bit.a.e;
      this.f = -1;
      this.g = Lists.newArrayList();
      if(var3 != 3 && var3 != 4) {
         throw new IllegalArgumentException("Method must be join or leave for player constructor");
      } else if(var2 != null && !var2.isEmpty()) {
         this.h = var3;
         this.a = var1.b();
         this.g.addAll(var2);
      } else {
         throw new IllegalArgumentException("Players cannot be null/empty");
      }
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(16);
      this.h = var1.readByte();
      if(this.h == 0 || this.h == 2) {
         this.b = var1.readString(32);
         this.c = var1.readString(16);
         this.d = var1.readString(16);
         this.i = var1.readByte();
         this.e = var1.readString(32);
         this.f = var1.readByte();
      }

      if(this.h == 0 || this.h == 3 || this.h == 4) {
         int var2 = var1.readVarInt();

         for(int var3 = 0; var3 < var2; ++var3) {
            this.g.add(var1.readString(40));
         }
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeByte(this.h);
      if(this.h == 0 || this.h == 2) {
         var1.writeString(this.b);
         var1.writeString(this.c);
         var1.writeString(this.d);
         var1.writeByte(this.i);
         var1.writeString(this.e);
         var1.writeByte(this.f);
      }

      if(this.h == 0 || this.h == 3 || this.h == 4) {
         var1.writeVarInt(this.g.size());
         Iterator var2 = this.g.iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.writeString(var3);
         }
      }

   }

   public void a(gx var1) {
      var1.a(this);
   }
}
