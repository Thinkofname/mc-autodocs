import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PacketClientbound3E extends ft {

   private String a = "";
   private String b = "";
   private String c = "";
   private String d = "";
   private Collection e = new ArrayList();
   private int f;
   private int g;


   public PacketClientbound3E() {}

   public PacketClientbound3E(azx var1, int var2) {
      this.a = var1.b();
      this.f = var2;
      if(var2 == 0 || var2 == 2) {
         this.b = var1.c();
         this.c = var1.e();
         this.d = var1.f();
         this.g = var1.i();
      }

      if(var2 == 0) {
         this.e.addAll(var1.d());
      }

   }

   public PacketClientbound3E(azx var1, Collection var2, int var3) {
      if(var3 != 3 && var3 != 4) {
         throw new IllegalArgumentException("Method must be join or leave for player constructor");
      } else if(var2 != null && !var2.isEmpty()) {
         this.f = var3;
         this.a = var1.b();
         this.e.addAll(var2);
      } else {
         throw new IllegalArgumentException("Players cannot be null/empty");
      }
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(16);
      this.f = var1.readByte();
      if(this.f == 0 || this.f == 2) {
         this.b = var1.readString(32);
         this.c = var1.readString(16);
         this.d = var1.readString(16);
         this.g = var1.readByte();
      }

      if(this.f == 0 || this.f == 3 || this.f == 4) {
         short var2 = var1.readShort();

         for(int var3 = 0; var3 < var2; ++var3) {
            this.e.add(var1.readString(16));
         }
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeByte(this.f);
      if(this.f == 0 || this.f == 2) {
         var1.writeString(this.b);
         var1.writeString(this.c);
         var1.writeString(this.d);
         var1.writeByte(this.g);
      }

      if(this.f == 0 || this.f == 3 || this.f == 4) {
         var1.writeShort(this.e.size());
         Iterator var2 = this.e.iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.writeString(var3);
         }
      }

   }

   public void a(fv var1) {
      var1.a(this);
   }
}
