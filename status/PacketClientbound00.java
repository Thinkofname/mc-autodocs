import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 extends gt {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(lk.class, new ll()).registerTypeAdapter(lh.class, new li()).registerTypeAdapter(lg.class, new lj()).registerTypeHierarchyAdapter(gi.class, new gj()).registerTypeHierarchyAdapter(gn.class, new gp()).registerTypeAdapterFactory(new rk()).create();
   private lg b;


   public PacketClientbound00() {}

   public PacketClientbound00(lg var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (lg)a.fromJson(var1.readString(32767), lg.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(ld var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

}
