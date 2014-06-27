import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 implements hb {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(mg.class, new mh()).registerTypeAdapter(md.class, new me()).registerTypeAdapter(mc.class, new mf()).registerTypeHierarchyAdapter(go.class, new gp()).registerTypeHierarchyAdapter(gv.class, new gx()).registerTypeAdapterFactory(new sh()).create();
   private mc b;


   public PacketClientbound00() {}

   public PacketClientbound00(mc var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (mc)a.fromJson(var1.readString(32767), mc.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(lz var1) {
      var1.a(this);
   }

}
