import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 extends gj {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(la.class, new lb()).registerTypeAdapter(kx.class, new ky()).registerTypeAdapter(kw.class, new kz()).registerTypeHierarchyAdapter(fz.class, new ga()).registerTypeHierarchyAdapter(gd.class, new gf()).registerTypeAdapterFactory(new qb()).create();
   private kw b;


   public PacketClientbound00() {}

   public PacketClientbound00(kw var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (kw)a.fromJson(var1.readString(32767), kw.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(kt var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

}
