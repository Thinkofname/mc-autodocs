import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 implements hz {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(nl.class, new nm()).registerTypeAdapter(ni.class, new nj()).registerTypeAdapter(nh.class, new nk()).registerTypeHierarchyAdapter(hk.class, new hl()).registerTypeHierarchyAdapter(hr.class, new ht()).registerTypeAdapterFactory(new ue()).create();
   private nh b;


   public PacketClientbound00() {}

   public PacketClientbound00(nh var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (nh)a.fromJson(var1.readString(32767), nh.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(ne var1) {
      var1.a(this);
   }

}
