import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 extends gk {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(lb.class, new lc()).registerTypeAdapter(ky.class, new kz()).registerTypeAdapter(kx.class, new la()).registerTypeHierarchyAdapter(ga.class, new gb()).registerTypeHierarchyAdapter(ge.class, new gg()).registerTypeAdapterFactory(new qc()).create();
   private kx b;


   public PacketClientbound00() {}

   public PacketClientbound00(kx var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (kx)a.fromJson(var1.readString(32767), kx.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(ku var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

}
