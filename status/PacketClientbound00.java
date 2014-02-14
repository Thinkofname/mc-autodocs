import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 extends gs {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(lj.class, new lk()).registerTypeAdapter(lg.class, new lh()).registerTypeAdapter(lf.class, new li()).registerTypeHierarchyAdapter(gh.class, new gi()).registerTypeHierarchyAdapter(gm.class, new go()).registerTypeAdapterFactory(new ql()).create();
   private lf b;


   public PacketClientbound00() {}

   public PacketClientbound00(lf var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (lf)a.fromJson(var1.readString(32767), lf.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(lc var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

}
