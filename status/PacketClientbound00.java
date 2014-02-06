import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 extends gm {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(ld.class, new le()).registerTypeAdapter(la.class, new lb()).registerTypeAdapter(kz.class, new lc()).registerTypeHierarchyAdapter(gc.class, new gd()).registerTypeHierarchyAdapter(gg.class, new gi()).registerTypeAdapterFactory(new qe()).create();
   private kz b;


   public PacketClientbound00() {}

   public PacketClientbound00(kz var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (kz)a.fromJson(var1.readString(32767), kz.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(kw var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

}
