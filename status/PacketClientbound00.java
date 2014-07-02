import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 implements hf {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(mk.class, new ml()).registerTypeAdapter(mh.class, new mi()).registerTypeAdapter(mg.class, new mj()).registerTypeHierarchyAdapter(gs.class, new gt()).registerTypeHierarchyAdapter(gz.class, new hb()).registerTypeAdapterFactory(new sp()).create();
   private mg b;


   public PacketClientbound00() {}

   public PacketClientbound00(mg var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (mg)a.fromJson(var1.readString(32767), mg.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(md var1) {
      var1.a(this);
   }

}
