import java.util.List;

public class PacketClientbound26 implements ib {

   private int[] a;
   private int[] b;
   private jo[] c;
   private boolean d;


   public PacketClientbound26() {}

   public PacketClientbound26(List var1) {
      int var2 = var1.size();
      this.a = new int[var2];
      this.b = new int[var2];
      this.c = new jo[var2];
      this.d = !((bdy)var1.get(0)).p().t.p();

      for(int var3 = 0; var3 < var2; ++var3) {
         bdy var4 = (bdy)var1.get(var3);
         jo var5 = jn.a(var4, true, this.d, '\uffff');
         this.a[var3] = var4.a;
         this.b[var3] = var4.b;
         this.c[var3] = var5;
      }

   }

   public void read(PacketBuffer var1) {
      this.d = var1.readBoolean();
      int var2 = var1.readVarInt();
      this.a = new int[var2];
      this.b = new int[var2];
      this.c = new jo[var2];

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         this.a[var3] = var1.readInt();
         this.b[var3] = var1.readInt();
         this.c[var3] = new jo();
         this.c[var3].b = var1.readShort() & '\uffff';
         this.c[var3].a = new byte[jn.a(Integer.bitCount(this.c[var3].b), this.d, true)];
      }

      for(var3 = 0; var3 < var2; ++var3) {
         var1.readBytes(this.c[var3].a);
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeBoolean(this.d);
      var1.writeVarInt(this.c.length);

      int var2;
      for(var2 = 0; var2 < this.a.length; ++var2) {
         var1.writeInt(this.a[var2]);
         var1.writeInt(this.b[var2]);
         var1.writeShort((short)(this.c[var2].b & '\uffff'));
      }

      for(var2 = 0; var2 < this.a.length; ++var2) {
         var1.writeBytes(this.c[var2].a);
      }

   }

   public void a(ii var1) {
      var1.a(this);
   }
}
