import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 extends gv {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(lt.class, new lu()).registerTypeAdapter(lq.class, new lr()).registerTypeAdapter(lp.class, new ls()).registerTypeHierarchyAdapter(gk.class, new gl()).registerTypeHierarchyAdapter(gp.class, new gr()).registerTypeAdapterFactory(new rv()).create();
   private lp b;


   public PacketClientbound00() {}

   public PacketClientbound00(lp var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (lp)a.fromJson(var1.readString(32767), lp.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(lm var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

}
