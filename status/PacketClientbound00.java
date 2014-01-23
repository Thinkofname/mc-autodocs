import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 extends gf {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(kv.class, new kw()).registerTypeAdapter(ks.class, new kt()).registerTypeAdapter(kr.class, new ku()).registerTypeHierarchyAdapter(fv.class, new fw()).registerTypeHierarchyAdapter(fz.class, new gb()).registerTypeAdapterFactory(new pw()).create();
   private kr b;


   public PacketClientbound00() {}

   public PacketClientbound00(kr var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (kr)a.fromJson(var1.readString(32767), kr.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(ko var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

}
