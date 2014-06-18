import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 implements ha {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(me.class, new mf()).registerTypeAdapter(mb.class, new mc()).registerTypeAdapter(ma.class, new md()).registerTypeHierarchyAdapter(gn.class, new go()).registerTypeHierarchyAdapter(gu.class, new gw()).registerTypeAdapterFactory(new sf()).create();
   private ma b;


   public PacketClientbound00() {}

   public PacketClientbound00(ma var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (ma)a.fromJson(var1.readString(32767), ma.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(lx var1) {
      var1.a(this);
   }

}
